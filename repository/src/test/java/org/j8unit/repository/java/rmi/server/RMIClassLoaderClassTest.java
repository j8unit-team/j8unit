package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIClassLoaderClassTest
implements org.j8unit.repository.java.rmi.server.RMIClassLoaderClassTests<java.rmi.server.RMIClassLoader> {

    @Override
    public Class<java.rmi.server.RMIClassLoader> createNewSUT() {
        return java.rmi.server.RMIClassLoader.class;
    }

}
