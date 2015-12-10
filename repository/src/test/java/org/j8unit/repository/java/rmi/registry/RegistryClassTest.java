package org.j8unit.repository.java.rmi.registry;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RegistryClassTest
implements org.j8unit.repository.java.rmi.registry.RegistryClassTests<java.rmi.registry.Registry> {

    @Override
    public Class<java.rmi.registry.Registry> createNewSUT() {
        return java.rmi.registry.Registry.class;
    }

}
