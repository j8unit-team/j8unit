package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventObjectTest
implements org.j8unit.repository.java.util.EventObjectTests<java.util.EventObject> {

    @Override
    public java.util.EventObject createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.EventObject] available.");
    }

}
