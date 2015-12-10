package org.j8unit.repository.java.rmi.registry;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocateRegistryClassTest
implements org.j8unit.repository.java.rmi.registry.LocateRegistryClassTests<java.rmi.registry.LocateRegistry> {

    @Override
    public Class<java.rmi.registry.LocateRegistry> createNewSUT() {
        return java.rmi.registry.LocateRegistry.class;
    }

}
