package org.eclipse.cargotracker.interfaces.booking.web;

import org.junit.Test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChangeArrivalDeadlineDateDialogTest {

    @Test
    public void testDialogUsesRequiredBeanScopeAndLifecycle() throws Exception {
        ManagedBean managedBean = ChangeArrivalDeadlineDateDialog.class
                .getAnnotation(ManagedBean.class);

        assertEquals("changeArrivalDeadlineDateDialog", managedBean.name());
        assertTrue(ChangeArrivalDeadlineDateDialog.class
                .isAnnotationPresent(SessionScoped.class));
        assertTrue(Serializable.class
                .isAssignableFrom(ChangeArrivalDeadlineDateDialog.class));

        assertEquals(void.class,
                ChangeArrivalDeadlineDateDialog.class
                        .getMethod("showDialog", String.class).getReturnType());
        assertEquals(void.class,
                ChangeArrivalDeadlineDateDialog.class
                        .getMethod("handleReturn",
                                org.primefaces.event.SelectEvent.class)
                        .getReturnType());
        assertEquals(void.class,
                ChangeArrivalDeadlineDateDialog.class
                        .getMethod("cancel").getReturnType());
    }
}
