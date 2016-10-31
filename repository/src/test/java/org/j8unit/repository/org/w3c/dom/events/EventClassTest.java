package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.events.Event;

@RunWith(J8Unit4.class)
public class EventClassTest
implements org.j8unit.repository.org.w3c.dom.events.EventClassTests<Event> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.events.Event]

    @Override
    public Class<Event> createNewSUT() {
        return Event.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.events.Event]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.events.Event]

}
