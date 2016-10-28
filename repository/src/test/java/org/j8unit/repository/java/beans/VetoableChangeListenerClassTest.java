package org.j8unit.repository.java.beans;

import java.beans.VetoableChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VetoableChangeListenerClassTest
implements org.j8unit.repository.java.beans.VetoableChangeListenerClassTests<VetoableChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.VetoableChangeListener]

    @Override
    public Class<VetoableChangeListener> createNewSUT() {
        return VetoableChangeListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.VetoableChangeListener]

}
