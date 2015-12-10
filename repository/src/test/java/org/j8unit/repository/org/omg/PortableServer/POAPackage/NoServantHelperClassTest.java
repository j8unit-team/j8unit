package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoServantHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.NoServantHelperClassTests<org.omg.PortableServer.POAPackage.NoServantHelper> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.NoServantHelper> createNewSUT() {
        return org.omg.PortableServer.POAPackage.NoServantHelper.class;
    }

}
