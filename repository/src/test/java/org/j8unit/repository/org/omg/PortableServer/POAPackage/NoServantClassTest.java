package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoServantClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.NoServantClassTests<org.omg.PortableServer.POAPackage.NoServant> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.NoServant> createNewSUT() {
        return org.omg.PortableServer.POAPackage.NoServant.class;
    }

}
