package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.AdapterActivator;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AdapterActivator} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.AdapterActivatorTests}).
 */
@RunWith(J8Unit4.class)
public class AdapterActivatorTest
implements AdapterActivatorTests<AdapterActivator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.AdapterActivator]

    @Override
    public AdapterActivator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.AdapterActivator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.AdapterActivator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.AdapterActivator]

}
