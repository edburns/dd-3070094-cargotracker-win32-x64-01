package org.eclipse.cargotracker.interfaces.booking.web;

import org.eclipse.cargotracker.interfaces.booking.facade.BookingServiceFacade;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Focused, container-free unit test for {@link ChangeArrivalDeadlineDate}. Uses
 * a hand-written {@link BookingServiceFacade} fake/spy instead of a mocking
 * framework.
 */
public class ChangeArrivalDeadlineDateTest {

    private static final String TRACKING_ID = "ABC123";

    private static class SpyBookingServiceFacade implements BookingServiceFacade {

        CargoRoute cargoToReturn;
        RuntimeException changeDeadlineFailure;

        int loadCargoForRoutingCallCount = 0;
        String capturedLoadTrackingId;

        int changeDeadlineCallCount = 0;
        String capturedTrackingId;
        Date capturedDeadline;

        @Override
        public String bookNewCargo(String origin, String destination, Date arrivalDeadline) {
            throw new UnsupportedOperationException("Not used by this test.");
        }

        @Override
        public CargoRoute loadCargoForRouting(String trackingId) {
            loadCargoForRoutingCallCount++;
            capturedLoadTrackingId = trackingId;
            return cargoToReturn;
        }

        @Override
        public void assignCargoToRoute(String trackingId, RouteCandidate route) {
            throw new UnsupportedOperationException("Not used by this test.");
        }

        @Override
        public void changeDestination(String trackingId, String destinationUnLocode) {
            throw new UnsupportedOperationException("Not used by this test.");
        }

        @Override
        public void changeDeadline(String trackingId, Date arrivalDeadline) {
            changeDeadlineCallCount++;
            capturedTrackingId = trackingId;
            capturedDeadline = arrivalDeadline;

            if (changeDeadlineFailure != null) {
                throw changeDeadlineFailure;
            }
        }

        @Override
        public List<RouteCandidate> requestPossibleRoutesForCargo(String trackingId) {
            throw new UnsupportedOperationException("Not used by this test.");
        }

        @Override
        public List<Location> listShippingLocations() {
            throw new UnsupportedOperationException("Not used by this test.");
        }

        @Override
        public List<CargoRoute> listAllCargos() {
            throw new UnsupportedOperationException("Not used by this test.");
        }
    }

    /**
     * A cargo DTO whose date-only representation is not parseable, used to
     * prove that malformed input is surfaced rather than silently ignored.
     */
    private static class MalformedCargoRoute extends CargoRoute {

        private static final long serialVersionUID = 1L;

        MalformedCargoRoute(Date arrivalDeadline) {
            super(TRACKING_ID, "USNYC", "DEHAM", arrivalDeadline, false, false, "USNYC", "IN_PORT");
        }

        @Override
        public String getArrivalDeadlineDate() {
            return "not a date";
        }
    }

    private ChangeArrivalDeadlineDate newBean(SpyBookingServiceFacade facade) throws Exception {
        ChangeArrivalDeadlineDate bean = new ChangeArrivalDeadlineDate();
        Field field = ChangeArrivalDeadlineDate.class.getDeclaredField("bookingServiceFacade");
        field.setAccessible(true);
        field.set(bean, facade);
        bean.setTrackingId(TRACKING_ID);
        return bean;
    }

    private CargoRoute cargoWithDeadline(Date arrivalDeadline) {
        return new CargoRoute(TRACKING_ID, "USNYC", "DEHAM", arrivalDeadline, false, false,
                "USNYC", "IN_PORT");
    }

    @Test
    public void testLoadUsesTrackingIdAndConvertsTheFormattedDeadline() throws Exception {
        Date deadline = new SimpleDateFormat("MM/dd/yyyy HH:mm").parse("03/15/2014 14:30");

        SpyBookingServiceFacade facade = new SpyBookingServiceFacade();
        facade.cargoToReturn = cargoWithDeadline(deadline);

        ChangeArrivalDeadlineDate bean = newBean(facade);
        bean.load();

        assertEquals(1, facade.loadCargoForRoutingCallCount);
        assertEquals(TRACKING_ID, facade.capturedLoadTrackingId);
        assertSame(facade.cargoToReturn, bean.getCargo());
        assertEquals(new SimpleDateFormat("MM/dd/yyyy").parse("03/15/2014"),
                bean.getArrivalDeadlineDate());
    }

    @Test
    public void testLoadSurfacesMalformedDeadlineInsteadOfSubmittingNull() throws Exception {
        Date deadline = new SimpleDateFormat("MM/dd/yyyy").parse("03/15/2014");

        SpyBookingServiceFacade facade = new SpyBookingServiceFacade();
        facade.cargoToReturn = new MalformedCargoRoute(deadline);

        ChangeArrivalDeadlineDate bean = newBean(facade);

        try {
            bean.load();
            fail("Expected the malformed arrival deadline to be surfaced as an error.");
        } catch (RuntimeException expected) {
            assertTrue(expected.getMessage().contains(TRACKING_ID));
        }

        assertNull(bean.getArrivalDeadlineDate());
        assertEquals(0, facade.changeDeadlineCallCount);
    }

    @Test
    public void testChangeArrivalDeadlineDelegatesTrackingIdAndSelectedDate() throws Exception {
        Date selected = new SimpleDateFormat("MM/dd/yyyy").parse("04/20/2014");

        SpyBookingServiceFacade facade = new SpyBookingServiceFacade();
        ChangeArrivalDeadlineDate bean = newBean(facade);
        bean.setArrivalDeadlineDate(selected);

        try {
            bean.changeArrivalDeadline();
        } catch (RuntimeException outsideOfJsfContext) {
            // Closing the dynamic dialog needs a JSF context, which is absent
            // in this container-free test. Delegation happens before that.
        }

        assertEquals(1, facade.changeDeadlineCallCount);
        assertEquals(TRACKING_ID, facade.capturedTrackingId);
        assertEquals(selected, facade.capturedDeadline);
    }

    @Test
    public void testChangeArrivalDeadlineRejectsNullDate() throws Exception {
        SpyBookingServiceFacade facade = new SpyBookingServiceFacade();
        ChangeArrivalDeadlineDate bean = newBean(facade);

        bean.changeArrivalDeadline();

        assertEquals(0, facade.changeDeadlineCallCount);
    }

    @Test
    public void testFacadeFailurePropagatesBeforeDialogIsClosed() throws Exception {
        Date selected = new SimpleDateFormat("MM/dd/yyyy").parse("04/20/2014");

        SpyBookingServiceFacade facade = new SpyBookingServiceFacade();
        facade.changeDeadlineFailure = new IllegalStateException("Cargo cannot be changed.");

        ChangeArrivalDeadlineDate bean = newBean(facade);
        bean.setArrivalDeadlineDate(selected);

        try {
            bean.changeArrivalDeadline();
            fail("Expected the facade failure to propagate.");
        } catch (IllegalStateException expected) {
            assertSame(facade.changeDeadlineFailure, expected);
        }

        assertEquals(1, facade.changeDeadlineCallCount);
    }
}
