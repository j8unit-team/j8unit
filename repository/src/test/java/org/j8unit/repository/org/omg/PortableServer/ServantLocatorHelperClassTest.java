package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantLocatorHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantLocatorHelperClassTests<org.omg.PortableServer.ServantLocatorHelper> {

    @Override
    public Class<org.omg.PortableServer.ServantLocatorHelper> createNewSUT() {
        return org.omg.PortableServer.ServantLocatorHelper.class;
    }

}
