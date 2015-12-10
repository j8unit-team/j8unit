package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VetoableChangeSupportClassTest
implements org.j8unit.repository.java.beans.VetoableChangeSupportClassTests<java.beans.VetoableChangeSupport> {

    @Override
    public Class<java.beans.VetoableChangeSupport> createNewSUT() {
        return java.beans.VetoableChangeSupport.class;
    }

}
