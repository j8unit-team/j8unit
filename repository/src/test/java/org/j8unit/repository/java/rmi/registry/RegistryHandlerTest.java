package org.j8unit.repository.java.rmi.registry;

import java.rmi.registry.RegistryHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RegistryHandler} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.registry.RegistryHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class RegistryHandlerTest
implements RegistryHandlerTests<RegistryHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.registry.RegistryHandler]

    @Override
    public RegistryHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.registry.RegistryHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.registry.RegistryHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.registry.RegistryHandler]

}
