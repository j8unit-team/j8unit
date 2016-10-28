package org.j8unit.repository.java.beans;

import java.beans.PropertyChangeEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyChangeEventTest
implements org.j8unit.repository.java.beans.PropertyChangeEventTests<PropertyChangeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.PropertyChangeEvent]

    @Override
    public PropertyChangeEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.PropertyChangeEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.PropertyChangeEvent]

}
