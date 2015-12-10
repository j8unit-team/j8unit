package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterAlreadyExistsClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.AdapterAlreadyExistsClassTests<org.omg.PortableServer.POAPackage.AdapterAlreadyExists> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.AdapterAlreadyExists> createNewSUT() {
        return org.omg.PortableServer.POAPackage.AdapterAlreadyExists.class;
    }

}
