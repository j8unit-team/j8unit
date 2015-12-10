package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectNotActiveClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ObjectNotActiveClassTests<org.omg.PortableServer.POAPackage.ObjectNotActive> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.ObjectNotActive> createNewSUT() {
        return org.omg.PortableServer.POAPackage.ObjectNotActive.class;
    }

}
