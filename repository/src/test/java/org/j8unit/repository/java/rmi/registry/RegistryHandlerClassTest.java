package org.j8unit.repository.java.rmi.registry;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RegistryHandlerClassTest
implements org.j8unit.repository.java.rmi.registry.RegistryHandlerClassTests<java.rmi.registry.RegistryHandler> {

    @Override
    public Class<java.rmi.registry.RegistryHandler> createNewSUT() {
        return java.rmi.registry.RegistryHandler.class;
    }

}
