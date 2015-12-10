package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventExceptionClassTest
implements org.j8unit.repository.org.w3c.dom.events.EventExceptionClassTests<org.w3c.dom.events.EventException> {

    @Override
    public Class<org.w3c.dom.events.EventException> createNewSUT() {
        return org.w3c.dom.events.EventException.class;
    }

}
