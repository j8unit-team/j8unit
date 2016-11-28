package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.events.EventListener;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EventListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.events.EventListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class EventListenerClassTest
implements EventListenerClassTests<EventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.events.EventListener]

    @Override
    public Class<EventListener> createNewSUT() {
        return EventListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.events.EventListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.events.EventListener]

}
