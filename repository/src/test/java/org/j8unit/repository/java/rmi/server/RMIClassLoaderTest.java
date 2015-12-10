package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIClassLoaderTest
implements org.j8unit.repository.java.rmi.server.RMIClassLoaderTests<java.rmi.server.RMIClassLoader> {

    @Override
    public java.rmi.server.RMIClassLoader createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.rmi.server.RMIClassLoader] available.");
    }

}
