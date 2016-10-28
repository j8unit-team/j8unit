package org.j8unit.repository.java.beans;

import java.beans.PropertyChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyChangeListenerClassTest
implements org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<PropertyChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.PropertyChangeListener]

    @Override
    public Class<PropertyChangeListener> createNewSUT() {
        return PropertyChangeListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.PropertyChangeListener]

}
