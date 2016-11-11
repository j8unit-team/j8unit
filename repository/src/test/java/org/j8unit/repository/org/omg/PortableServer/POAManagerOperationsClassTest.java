package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAManagerOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link POAManagerOperations} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.POAManagerOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class POAManagerOperationsClassTest
implements POAManagerOperationsClassTests<POAManagerOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAManagerOperations]

    @Override
    public Class<POAManagerOperations> createNewSUT() {
        return POAManagerOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.POAManagerOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAManagerOperations]

}
