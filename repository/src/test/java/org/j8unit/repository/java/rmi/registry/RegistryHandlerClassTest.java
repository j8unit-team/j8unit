package org.j8unit.repository.java.rmi.registry;

import java.rmi.registry.RegistryHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RegistryHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.registry.RegistryHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class RegistryHandlerClassTest
implements RegistryHandlerClassTests<RegistryHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.registry.RegistryHandler]

    @Override
    public Class<RegistryHandler> createNewSUT() {
        return RegistryHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.registry.RegistryHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.registry.RegistryHandler]

}
