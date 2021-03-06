package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.events.EventException;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EventException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.events.EventExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class EventExceptionTest
implements EventExceptionTests<EventException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.events.EventException]

    @Override
    public EventException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.w3c.dom.events.EventException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.events.EventException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.events.EventException]

}
