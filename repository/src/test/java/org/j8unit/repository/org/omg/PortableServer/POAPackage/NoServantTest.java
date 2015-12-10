package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoServantTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.NoServantTests<org.omg.PortableServer.POAPackage.NoServant> {

    @Override
    public org.omg.PortableServer.POAPackage.NoServant createNewSUT() {
        return new org.omg.PortableServer.POAPackage.NoServant();
    }

}
