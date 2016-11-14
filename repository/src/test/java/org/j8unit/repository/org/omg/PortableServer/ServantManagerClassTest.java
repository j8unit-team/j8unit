package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantManager;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServantManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.ServantManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServantManagerClassTest
implements ServantManagerClassTests<ServantManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantManager]

    @Override
    public Class<ServantManager> createNewSUT() {
        return ServantManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ServantManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantManager]

}
