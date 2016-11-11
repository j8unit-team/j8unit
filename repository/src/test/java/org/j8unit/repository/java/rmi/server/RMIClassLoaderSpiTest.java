package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMIClassLoaderSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RMIClassLoaderSpi} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.server.RMIClassLoaderSpiTests}).
 */

@RunWith(J8Unit4.class)
public class RMIClassLoaderSpiTest
implements RMIClassLoaderSpiTests<RMIClassLoaderSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RMIClassLoaderSpi]

    @Override
    public RMIClassLoaderSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.RMIClassLoaderSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.RMIClassLoaderSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.RMIClassLoaderSpi]

}
