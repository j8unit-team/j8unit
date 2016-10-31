package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantManager;

@RunWith(J8Unit4.class)
public class ServantManagerClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantManagerClassTests<ServantManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantManager]

    @Override
    public Class<ServantManager> createNewSUT() {
        return ServantManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ServantManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantManager]

}
