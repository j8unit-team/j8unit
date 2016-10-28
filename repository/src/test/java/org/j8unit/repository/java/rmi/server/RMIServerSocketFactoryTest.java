package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMIServerSocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIServerSocketFactoryTest
implements org.j8unit.repository.java.rmi.server.RMIServerSocketFactoryTests<RMIServerSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RMIServerSocketFactory]

    @Override
    public RMIServerSocketFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.RMIServerSocketFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RMIServerSocketFactory]

}
