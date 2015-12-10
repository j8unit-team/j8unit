package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantAlreadyActiveTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ServantAlreadyActiveTests<org.omg.PortableServer.POAPackage.ServantAlreadyActive> {

    @Override
    public org.omg.PortableServer.POAPackage.ServantAlreadyActive createNewSUT() {
        return new org.omg.PortableServer.POAPackage.ServantAlreadyActive();
    }

}
