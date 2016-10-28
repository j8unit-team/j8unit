package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMIClassLoaderSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIClassLoaderSpiTest
implements org.j8unit.repository.java.rmi.server.RMIClassLoaderSpiTests<RMIClassLoaderSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RMIClassLoaderSpi]

    @Override
    public RMIClassLoaderSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.RMIClassLoaderSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RMIClassLoaderSpi]

}
