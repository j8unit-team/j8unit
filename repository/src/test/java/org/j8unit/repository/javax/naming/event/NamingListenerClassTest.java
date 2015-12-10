package org.j8unit.repository.javax.naming.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingListenerClassTest
implements org.j8unit.repository.javax.naming.event.NamingListenerClassTests<javax.naming.event.NamingListener> {

    @Override
    public Class<javax.naming.event.NamingListener> createNewSUT() {
        return javax.naming.event.NamingListener.class;
    }

}
