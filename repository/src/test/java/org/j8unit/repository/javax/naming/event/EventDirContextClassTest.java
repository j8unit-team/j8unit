package org.j8unit.repository.javax.naming.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventDirContextClassTest
implements org.j8unit.repository.javax.naming.event.EventDirContextClassTests<javax.naming.event.EventDirContext> {

    @Override
    public Class<javax.naming.event.EventDirContext> createNewSUT() {
        return javax.naming.event.EventDirContext.class;
    }

}
