package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventTargetClassTest
implements org.j8unit.repository.org.w3c.dom.events.EventTargetClassTests<org.w3c.dom.events.EventTarget> {

    @Override
    public Class<org.w3c.dom.events.EventTarget> createNewSUT() {
        return org.w3c.dom.events.EventTarget.class;
    }

}
