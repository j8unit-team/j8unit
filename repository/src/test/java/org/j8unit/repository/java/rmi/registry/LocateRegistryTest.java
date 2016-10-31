package org.j8unit.repository.java.rmi.registry;

import java.rmi.registry.LocateRegistry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocateRegistryTest
implements org.j8unit.repository.java.rmi.registry.LocateRegistryTests<LocateRegistry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.registry.LocateRegistry]

    @Override
    public LocateRegistry createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.registry.LocateRegistry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.registry.LocateRegistry]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.registry.LocateRegistry]

}
