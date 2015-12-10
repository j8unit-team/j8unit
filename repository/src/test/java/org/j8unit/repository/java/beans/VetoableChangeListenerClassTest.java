package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VetoableChangeListenerClassTest
implements org.j8unit.repository.java.beans.VetoableChangeListenerClassTests<java.beans.VetoableChangeListener> {

    @Override
    public Class<java.beans.VetoableChangeListener> createNewSUT() {
        return java.beans.VetoableChangeListener.class;
    }

}
