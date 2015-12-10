package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectAlreadyActiveClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ObjectAlreadyActiveClassTests<org.omg.PortableServer.POAPackage.ObjectAlreadyActive> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.ObjectAlreadyActive> createNewSUT() {
        return org.omg.PortableServer.POAPackage.ObjectAlreadyActive.class;
    }

}
