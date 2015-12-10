package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterNonExistentTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.AdapterNonExistentTests<org.omg.PortableServer.POAPackage.AdapterNonExistent> {

    @Override
    public org.omg.PortableServer.POAPackage.AdapterNonExistent createNewSUT() {
        return new org.omg.PortableServer.POAPackage.AdapterNonExistent();
    }

}
