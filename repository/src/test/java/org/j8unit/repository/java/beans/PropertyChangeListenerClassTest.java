package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyChangeListenerClassTest
implements org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<java.beans.PropertyChangeListener> {

    @Override
    public Class<java.beans.PropertyChangeListener> createNewSUT() {
        return java.beans.PropertyChangeListener.class;
    }

}
