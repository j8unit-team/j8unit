package org.j8unit.repository.java.rmi.registry;

import java.rmi.registry.Registry;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Registry} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.registry.RegistryClassTests}).
 */
@RunWith(J8Unit4.class)
public class RegistryClassTest
implements RegistryClassTests<Registry> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.registry.Registry]

    @Override
    public Class<Registry> createNewSUT() {
        return Registry.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.registry.Registry]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.registry.Registry]

}
