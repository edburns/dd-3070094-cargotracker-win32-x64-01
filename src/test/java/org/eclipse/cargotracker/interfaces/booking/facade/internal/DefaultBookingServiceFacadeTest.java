package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import org.eclipse.cargotracker.application.BookingService;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * Focused, container-free unit test for {@link DefaultBookingServiceFacade#changeDeadline}.
 * Uses a hand-written {@link BookingService} fake/spy instead of a mocking framework.
 */
public class DefaultBookingServiceFacadeTest {

    private static class SpyBookingService implements BookingService {

        int changeDeadlineCallCount = 0;
        TrackingId capturedTrackingId;
        Date capturedDeadline;

        @Override
        public TrackingId bookNewCargo(UnLocode origin, UnLocode destination, Date arrivalDeadline) {
            throw new UnsupportedOperationException("Not used by this test.");
        }

        @Override
        public List<Itinerary> requestPossibleRoutesForCargo(TrackingId trackingId) {
            throw new UnsupportedOperationException("Not used by this test.");
        }

        @Override
        public void assignCargoToRoute(Itinerary itinerary, TrackingId trackingId) {
            throw new UnsupportedOperationException("Not used by this test.");
        }

        @Override
        public void changeDestination(TrackingId trackingId, UnLocode unLocode) {
            throw new UnsupportedOperationException("Not used by this test.");
        }

        @Override
        public void changeDeadline(TrackingId trackingId, Date deadline) {
            changeDeadlineCallCount++;
            capturedTrackingId = trackingId;
            capturedDeadline = deadline;
        }
    }

    @Test
    public void changeDeadlineDelegatesToBookingServiceExactlyOnce() throws Exception {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        SpyBookingService spy = new SpyBookingService();
        setField(facade, "bookingService", spy);

        String trackingIdString = "ABC123";
        Date arrivalDeadline = new Date();

        facade.changeDeadline(trackingIdString, arrivalDeadline);

        assertEquals(1, spy.changeDeadlineCallCount);
        assertEquals(new TrackingId(trackingIdString), spy.capturedTrackingId);
        assertSame(arrivalDeadline, spy.capturedDeadline);
    }

    private static void setField(Object target, String fieldName, Object value) throws Exception {
        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }
}
