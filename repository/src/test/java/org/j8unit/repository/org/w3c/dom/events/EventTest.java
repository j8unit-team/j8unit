package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.events.Event;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Event} (by simply reusing the J8Unit
 * test interface {@link EventTests}).
 */

@RunWith(J8Unit4.class)
public class EventTest
implements EventTests<Event> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.events.Event]

    @Override
    public Event createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.events.Event], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.events.Event]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.events.Event]

}
