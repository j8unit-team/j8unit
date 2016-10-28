package org.j8unit.repository.java.rmi.registry;

import java.rmi.registry.RegistryHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RegistryHandlerClassTest
implements org.j8unit.repository.java.rmi.registry.RegistryHandlerClassTests<RegistryHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.registry.RegistryHandler]

    @Override
    public Class<RegistryHandler> createNewSUT() {
        return RegistryHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.registry.RegistryHandler]

}
