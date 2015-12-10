package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForwardRequestTest
implements org.j8unit.repository.org.omg.PortableServer.ForwardRequestTests<org.omg.PortableServer.ForwardRequest> {

    @Override
    public org.omg.PortableServer.ForwardRequest createNewSUT() {
        return new org.omg.PortableServer.ForwardRequest();
    }

}
