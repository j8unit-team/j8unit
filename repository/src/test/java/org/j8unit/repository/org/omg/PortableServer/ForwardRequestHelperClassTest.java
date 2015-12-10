package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForwardRequestHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.ForwardRequestHelperClassTests<org.omg.PortableServer.ForwardRequestHelper> {

    @Override
    public Class<org.omg.PortableServer.ForwardRequestHelper> createNewSUT() {
        return org.omg.PortableServer.ForwardRequestHelper.class;
    }

}
