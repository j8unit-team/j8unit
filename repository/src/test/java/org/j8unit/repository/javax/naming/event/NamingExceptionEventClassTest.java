package org.j8unit.repository.javax.naming.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingExceptionEventClassTest
implements org.j8unit.repository.javax.naming.event.NamingExceptionEventClassTests<javax.naming.event.NamingExceptionEvent> {

    @Override
    public Class<javax.naming.event.NamingExceptionEvent> createNewSUT() {
        return javax.naming.event.NamingExceptionEvent.class;
    }

}
