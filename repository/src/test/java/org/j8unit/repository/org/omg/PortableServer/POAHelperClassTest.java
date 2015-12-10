package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class POAHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAHelperClassTests<org.omg.PortableServer.POAHelper> {

    @Override
    public Class<org.omg.PortableServer.POAHelper> createNewSUT() {
        return org.omg.PortableServer.POAHelper.class;
    }

}
