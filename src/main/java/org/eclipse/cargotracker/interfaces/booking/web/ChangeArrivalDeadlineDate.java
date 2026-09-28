package org.eclipse.cargotracker.interfaces.booking.web;

import org.eclipse.cargotracker.interfaces.booking.facade.BookingServiceFacade;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Handles changing the arrival deadline of a cargo. Like the other booking user
 * interface controllers, it operates against the booking service facade only,
 * so the domain layer stays shielded from user interface considerations.
 */
@Named
@ViewScoped
public class ChangeArrivalDeadlineDate implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String DATE_FORMAT = "MM/dd/yyyy";

    private String trackingId;
    private CargoRoute cargo;
    private Date arrivalDeadlineDate;

    @Inject
    private BookingServiceFacade bookingServiceFacade;

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public CargoRoute getCargo() {
        return cargo;
    }

    public Date getArrivalDeadlineDate() {
        return arrivalDeadlineDate;
    }

    public void setArrivalDeadlineDate(Date arrivalDeadlineDate) {
        this.arrivalDeadlineDate = arrivalDeadlineDate;
    }

    public void load() {
        cargo = bookingServiceFacade.loadCargoForRouting(trackingId);

        // A fresh formatter per load; SimpleDateFormat is not thread safe.
        try {
            arrivalDeadlineDate = new SimpleDateFormat(DATE_FORMAT)
                    .parse(cargo.getArrivalDeadlineDate());
        } catch (ParseException e) {
            // Don't leave a stale deadline behind on a failed reload.
            arrivalDeadlineDate = null;
            throw new RuntimeException("Error parsing arrival deadline of cargo "
                    + "with tracking ID: " + trackingId, e);
        }
    }

    public void changeArrivalDeadline() {
        if (arrivalDeadlineDate == null) {
            addErrorMessage("An arrival deadline date must be selected.");
            return;
        }

        bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate);

        PrimeFaces.current().dialog().closeDynamic("DONE");
    }

    private void addErrorMessage(String detail) {
        // TODO See if this can be injected.
        FacesContext context = FacesContext.getCurrentInstance();

        if (context != null) {
            FacesMessage message = new FacesMessage(detail);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            context.addMessage(null, message);
        }
    }
}
