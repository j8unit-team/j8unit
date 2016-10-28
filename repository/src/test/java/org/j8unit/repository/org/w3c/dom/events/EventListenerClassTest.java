package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.events.EventListener;

@RunWith(J8Unit4.class)
public class EventListenerClassTest
implements org.j8unit.repository.org.w3c.dom.events.EventListenerClassTests<EventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.events.EventListener]

    @Override
    public Class<EventListener> createNewSUT() {
        return EventListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.events.EventListener]

}
