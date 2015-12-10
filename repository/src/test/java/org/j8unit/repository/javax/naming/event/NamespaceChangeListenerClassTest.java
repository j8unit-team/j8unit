package org.j8unit.repository.javax.naming.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamespaceChangeListenerClassTest
implements org.j8unit.repository.javax.naming.event.NamespaceChangeListenerClassTests<javax.naming.event.NamespaceChangeListener> {

    @Override
    public Class<javax.naming.event.NamespaceChangeListener> createNewSUT() {
        return javax.naming.event.NamespaceChangeListener.class;
    }

}
