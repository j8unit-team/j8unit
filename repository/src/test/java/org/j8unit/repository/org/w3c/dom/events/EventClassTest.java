package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventClassTest
implements org.j8unit.repository.org.w3c.dom.events.EventClassTests<org.w3c.dom.events.Event> {

    @Override
    public Class<org.w3c.dom.events.Event> createNewSUT() {
        return org.w3c.dom.events.Event.class;
    }

}
