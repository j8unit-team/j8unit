package org.j8unit.repository.javax.naming.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventContextClassTest
implements org.j8unit.repository.javax.naming.event.EventContextClassTests<javax.naming.event.EventContext> {

    @Override
    public Class<javax.naming.event.EventContext> createNewSUT() {
        return javax.naming.event.EventContext.class;
    }

}
