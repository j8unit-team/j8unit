package org.j8unit.repository.java.rmi.registry;

import java.rmi.registry.Registry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Registry} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.registry.RegistryTests}).
 */
@RunWith(J8Unit4.class)
public class RegistryTest
implements RegistryTests<Registry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.registry.Registry]

    @Override
    public Registry createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.registry.Registry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.registry.Registry]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.registry.Registry]

}
