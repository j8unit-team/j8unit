package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantNotActiveClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ServantNotActiveClassTests<org.omg.PortableServer.POAPackage.ServantNotActive> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.ServantNotActive> createNewSUT() {
        return org.omg.PortableServer.POAPackage.ServantNotActive.class;
    }

}
