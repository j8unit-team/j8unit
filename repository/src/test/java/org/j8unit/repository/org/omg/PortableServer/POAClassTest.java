package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POA;

@RunWith(J8Unit4.class)
public class POAClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAClassTests<POA> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POA]

    @Override
    public Class<POA> createNewSUT() {
        return POA.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POA]

}
