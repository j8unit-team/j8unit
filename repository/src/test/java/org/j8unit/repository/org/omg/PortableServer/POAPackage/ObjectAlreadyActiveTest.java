package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectAlreadyActiveTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ObjectAlreadyActiveTests<org.omg.PortableServer.POAPackage.ObjectAlreadyActive> {

    @Override
    public org.omg.PortableServer.POAPackage.ObjectAlreadyActive createNewSUT() {
        return new org.omg.PortableServer.POAPackage.ObjectAlreadyActive();
    }

}
