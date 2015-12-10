package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventTest
implements org.j8unit.repository.java.awt.EventTests<java.awt.Event> {

    @Override
    public java.awt.Event createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.Event] available.");
    }

}
