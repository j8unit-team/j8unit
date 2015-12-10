package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnreferencedClassTest
implements org.j8unit.repository.java.rmi.server.UnreferencedClassTests<java.rmi.server.Unreferenced> {

    @Override
    public Class<java.rmi.server.Unreferenced> createNewSUT() {
        return java.rmi.server.Unreferenced.class;
    }

}
