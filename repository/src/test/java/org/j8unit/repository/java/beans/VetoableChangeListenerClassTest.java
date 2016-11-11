package org.j8unit.repository.java.beans;

import java.beans.VetoableChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link VetoableChangeListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.beans.VetoableChangeListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class VetoableChangeListenerClassTest
implements VetoableChangeListenerClassTests<VetoableChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.VetoableChangeListener]

    @Override
    public Class<VetoableChangeListener> createNewSUT() {
        return VetoableChangeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.VetoableChangeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.VetoableChangeListener]

}
