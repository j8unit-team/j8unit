package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMISocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RMISocketFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.server.RMISocketFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class RMISocketFactoryTest
implements RMISocketFactoryTests<RMISocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RMISocketFactory]

    @Override
    public RMISocketFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.RMISocketFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.RMISocketFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.RMISocketFactory]

}
