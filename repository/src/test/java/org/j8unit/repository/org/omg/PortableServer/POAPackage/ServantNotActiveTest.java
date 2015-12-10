package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantNotActiveTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ServantNotActiveTests<org.omg.PortableServer.POAPackage.ServantNotActive> {

    @Override
    public org.omg.PortableServer.POAPackage.ServantNotActive createNewSUT() {
        return new org.omg.PortableServer.POAPackage.ServantNotActive();
    }

}
