package org.j8unit.repository.java.beans;

import java.beans.PropertyChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PropertyChangeListener} (by simply
 * reusing the J8Unit test interface {@link PropertyChangeListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class PropertyChangeListenerClassTest
implements PropertyChangeListenerClassTests<PropertyChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.PropertyChangeListener]

    @Override
    public Class<PropertyChangeListener> createNewSUT() {
        return PropertyChangeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.PropertyChangeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.PropertyChangeListener]

}
