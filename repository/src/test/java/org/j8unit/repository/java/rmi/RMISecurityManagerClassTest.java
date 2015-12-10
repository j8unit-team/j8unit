package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMISecurityManagerClassTest
implements org.j8unit.repository.java.rmi.RMISecurityManagerClassTests<java.rmi.RMISecurityManager> {

    @Override
    public Class<java.rmi.RMISecurityManager> createNewSUT() {
        return java.rmi.RMISecurityManager.class;
    }

}
