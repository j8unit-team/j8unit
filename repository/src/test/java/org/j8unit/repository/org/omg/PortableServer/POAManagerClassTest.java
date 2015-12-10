package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class POAManagerClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAManagerClassTests<org.omg.PortableServer.POAManager> {

    @Override
    public Class<org.omg.PortableServer.POAManager> createNewSUT() {
        return org.omg.PortableServer.POAManager.class;
    }

}
