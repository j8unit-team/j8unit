package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAManager;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link POAManager} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.PortableServer.POAManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class POAManagerClassTest
implements POAManagerClassTests<POAManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAManager]

    @Override
    public Class<POAManager> createNewSUT() {
        return POAManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.POAManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAManager]

}
