package org.j8unit.repository.javax.naming.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingEventClassTest
implements org.j8unit.repository.javax.naming.event.NamingEventClassTests<javax.naming.event.NamingEvent> {

    @Override
    public Class<javax.naming.event.NamingEvent> createNewSUT() {
        return javax.naming.event.NamingEvent.class;
    }

}
