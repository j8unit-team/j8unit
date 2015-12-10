package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VetoableChangeListenerProxyClassTest
implements org.j8unit.repository.java.beans.VetoableChangeListenerProxyClassTests<java.beans.VetoableChangeListenerProxy> {

    @Override
    public Class<java.beans.VetoableChangeListenerProxy> createNewSUT() {
        return java.beans.VetoableChangeListenerProxy.class;
    }

}
