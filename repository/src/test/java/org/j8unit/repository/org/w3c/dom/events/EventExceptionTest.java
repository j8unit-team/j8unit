package org.j8unit.repository.org.w3c.dom.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventExceptionTest
implements org.j8unit.repository.org.w3c.dom.events.EventExceptionTests<org.w3c.dom.events.EventException> {

    @Override
    public org.w3c.dom.events.EventException createNewSUT() {
        throw new AssertionError("There is no default constructor for [org.w3c.dom.events.EventException] available.");
    }

}
