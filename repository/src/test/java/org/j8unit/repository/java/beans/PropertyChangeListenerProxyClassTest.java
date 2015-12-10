package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyChangeListenerProxyClassTest
implements org.j8unit.repository.java.beans.PropertyChangeListenerProxyClassTests<java.beans.PropertyChangeListenerProxy> {

    @Override
    public Class<java.beans.PropertyChangeListenerProxy> createNewSUT() {
        return java.beans.PropertyChangeListenerProxy.class;
    }

}
