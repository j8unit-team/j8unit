package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.AdapterActivator;

@RunWith(J8Unit4.class)
public class AdapterActivatorTest
implements org.j8unit.repository.org.omg.PortableServer.AdapterActivatorTests<AdapterActivator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.AdapterActivator]

    @Override
    public AdapterActivator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.AdapterActivator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.AdapterActivator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.AdapterActivator]

}
