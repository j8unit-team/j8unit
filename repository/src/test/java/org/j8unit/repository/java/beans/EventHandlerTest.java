package org.j8unit.repository.java.beans;

import java.beans.EventHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EventHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.beans.EventHandlerTests}).
 */
@RunWith(J8Unit4.class)
public class EventHandlerTest
implements EventHandlerTests<EventHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.EventHandler]

    @Override
    public EventHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.EventHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.EventHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.EventHandler]

}
