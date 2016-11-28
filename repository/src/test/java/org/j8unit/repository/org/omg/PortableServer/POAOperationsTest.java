package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link POAOperations} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.POAOperationsTests}).
 */
@RunWith(J8Unit4.class)
public class POAOperationsTest
implements POAOperationsTests<POAOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAOperations]

    @Override
    public POAOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.POAOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.POAOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.POAOperations]

}
