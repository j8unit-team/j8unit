package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectNotActiveTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ObjectNotActiveTests<org.omg.PortableServer.POAPackage.ObjectNotActive> {

    @Override
    public org.omg.PortableServer.POAPackage.ObjectNotActive createNewSUT() {
        return new org.omg.PortableServer.POAPackage.ObjectNotActive();
    }

}
