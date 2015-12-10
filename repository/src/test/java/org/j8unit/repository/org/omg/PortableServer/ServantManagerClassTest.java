package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantManagerClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantManagerClassTests<org.omg.PortableServer.ServantManager> {

    @Override
    public Class<org.omg.PortableServer.ServantManager> createNewSUT() {
        return org.omg.PortableServer.ServantManager.class;
    }

}
