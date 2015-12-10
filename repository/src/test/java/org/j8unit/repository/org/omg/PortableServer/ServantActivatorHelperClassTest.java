package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantActivatorHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantActivatorHelperClassTests<org.omg.PortableServer.ServantActivatorHelper> {

    @Override
    public Class<org.omg.PortableServer.ServantActivatorHelper> createNewSUT() {
        return org.omg.PortableServer.ServantActivatorHelper.class;
    }

}
