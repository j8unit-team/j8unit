package org.j8unit.repository.javax.naming.event;

import javax.naming.event.NamespaceChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamespaceChangeListenerClassTest
implements org.j8unit.repository.javax.naming.event.NamespaceChangeListenerClassTests<NamespaceChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.event.NamespaceChangeListener]

    @Override
    public Class<NamespaceChangeListener> createNewSUT() {
        return NamespaceChangeListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.event.NamespaceChangeListener]

}
