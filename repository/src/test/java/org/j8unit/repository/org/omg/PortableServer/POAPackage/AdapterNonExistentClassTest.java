package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterNonExistentClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.AdapterNonExistentClassTests<org.omg.PortableServer.POAPackage.AdapterNonExistent> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.AdapterNonExistent> createNewSUT() {
        return org.omg.PortableServer.POAPackage.AdapterNonExistent.class;
    }

}
