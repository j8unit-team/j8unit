package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VetoableChangeSupportTest
implements org.j8unit.repository.java.beans.VetoableChangeSupportTests<java.beans.VetoableChangeSupport> {

    @Override
    public java.beans.VetoableChangeSupport createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.beans.VetoableChangeSupport] available.");
    }

}
