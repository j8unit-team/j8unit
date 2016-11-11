package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.events.EventTarget;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EventTarget} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.events.EventTargetClassTests}).
 */

@RunWith(J8Unit4.class)
public class EventTargetClassTest
implements EventTargetClassTests<EventTarget> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.events.EventTarget]

    @Override
    public Class<EventTarget> createNewSUT() {
        return EventTarget.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.events.EventTarget]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.events.EventTarget]

}
