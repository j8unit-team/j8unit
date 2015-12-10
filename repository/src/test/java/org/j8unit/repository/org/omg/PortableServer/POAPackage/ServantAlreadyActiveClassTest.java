package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantAlreadyActiveClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ServantAlreadyActiveClassTests<org.omg.PortableServer.POAPackage.ServantAlreadyActive> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.ServantAlreadyActive> createNewSUT() {
        return org.omg.PortableServer.POAPackage.ServantAlreadyActive.class;
    }

}
