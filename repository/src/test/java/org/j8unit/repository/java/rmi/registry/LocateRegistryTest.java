package org.j8unit.repository.java.rmi.registry;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocateRegistryTest
implements org.j8unit.repository.java.rmi.registry.LocateRegistryTests<java.rmi.registry.LocateRegistry> {

    @Override
    public java.rmi.registry.LocateRegistry createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.registry.LocateRegistry] available.");
    }

}
