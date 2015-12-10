package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterAlreadyExistsTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.AdapterAlreadyExistsTests<org.omg.PortableServer.POAPackage.AdapterAlreadyExists> {

    @Override
    public org.omg.PortableServer.POAPackage.AdapterAlreadyExists createNewSUT() {
        return new org.omg.PortableServer.POAPackage.AdapterAlreadyExists();
    }

}
