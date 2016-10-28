package org.j8unit.repository.java.beans;

import java.beans.EventHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventHandlerTest
implements org.j8unit.repository.java.beans.EventHandlerTests<EventHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.EventHandler]

    @Override
    public EventHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.EventHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.EventHandler]

}
