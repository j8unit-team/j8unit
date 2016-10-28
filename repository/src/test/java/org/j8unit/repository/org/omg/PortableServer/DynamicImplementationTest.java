package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.DynamicImplementation;

@RunWith(J8Unit4.class)
public class DynamicImplementationTest
implements org.j8unit.repository.org.omg.PortableServer.DynamicImplementationTests<DynamicImplementation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.DynamicImplementation]

    @Override
    public DynamicImplementation createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.DynamicImplementation], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.DynamicImplementation]

}
