package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventListenerClassTest
implements org.j8unit.repository.org.w3c.dom.events.EventListenerClassTests<org.w3c.dom.events.EventListener> {

    @Override
    public Class<org.w3c.dom.events.EventListener> createNewSUT() {
        return org.w3c.dom.events.EventListener.class;
    }

}
