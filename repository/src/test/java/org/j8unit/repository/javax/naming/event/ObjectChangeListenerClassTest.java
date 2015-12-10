package org.j8unit.repository.javax.naming.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectChangeListenerClassTest
implements org.j8unit.repository.javax.naming.event.ObjectChangeListenerClassTests<javax.naming.event.ObjectChangeListener> {

    @Override
    public Class<javax.naming.event.ObjectChangeListener> createNewSUT() {
        return javax.naming.event.ObjectChangeListener.class;
    }

}
