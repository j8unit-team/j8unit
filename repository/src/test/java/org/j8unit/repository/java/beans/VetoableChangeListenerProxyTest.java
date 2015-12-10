package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VetoableChangeListenerProxyTest
implements org.j8unit.repository.java.beans.VetoableChangeListenerProxyTests<java.beans.VetoableChangeListenerProxy> {

    @Override
    public java.beans.VetoableChangeListenerProxy createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.beans.VetoableChangeListenerProxy] available.");
    }

}
