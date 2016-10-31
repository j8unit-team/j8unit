package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMIClientSocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIClientSocketFactoryTest
implements org.j8unit.repository.java.rmi.server.RMIClientSocketFactoryTests<RMIClientSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RMIClientSocketFactory]

    @Override
    public RMIClientSocketFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.RMIClientSocketFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.RMIClientSocketFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.RMIClientSocketFactory]

}
