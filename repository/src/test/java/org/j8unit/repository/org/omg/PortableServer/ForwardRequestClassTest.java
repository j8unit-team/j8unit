package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForwardRequestClassTest
implements org.j8unit.repository.org.omg.PortableServer.ForwardRequestClassTests<org.omg.PortableServer.ForwardRequest> {

    @Override
    public Class<org.omg.PortableServer.ForwardRequest> createNewSUT() {
        return org.omg.PortableServer.ForwardRequest.class;
    }

}
