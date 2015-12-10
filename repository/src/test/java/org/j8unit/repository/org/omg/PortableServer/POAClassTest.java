package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class POAClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAClassTests<org.omg.PortableServer.POA> {

    @Override
    public Class<org.omg.PortableServer.POA> createNewSUT() {
        return org.omg.PortableServer.POA.class;
    }

}
