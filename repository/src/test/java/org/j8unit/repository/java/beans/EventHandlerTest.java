package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventHandlerTest
implements org.j8unit.repository.java.beans.EventHandlerTests<java.beans.EventHandler> {

    @Override
    public java.beans.EventHandler createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.beans.EventHandler] available.");
    }

}
