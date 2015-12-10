package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMISecurityManagerTest
implements org.j8unit.repository.java.rmi.RMISecurityManagerTests<java.rmi.RMISecurityManager> {

    @Override
    public java.rmi.RMISecurityManager createNewSUT() {
        return new java.rmi.RMISecurityManager();
    }

}
