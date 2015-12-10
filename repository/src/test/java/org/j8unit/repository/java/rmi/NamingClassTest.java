package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingClassTest
implements org.j8unit.repository.java.rmi.NamingClassTests<java.rmi.Naming> {

    @Override
    public Class<java.rmi.Naming> createNewSUT() {
        return java.rmi.Naming.class;
    }

}
