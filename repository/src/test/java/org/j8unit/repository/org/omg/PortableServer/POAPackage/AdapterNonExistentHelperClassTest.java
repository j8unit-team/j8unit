package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterNonExistentHelperClassTest
implements
org.j8unit.repository.org.omg.PortableServer.POAPackage.AdapterNonExistentHelperClassTests<org.omg.PortableServer.POAPackage.AdapterNonExistentHelper> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.AdapterNonExistentHelper> createNewSUT() {
        return org.omg.PortableServer.POAPackage.AdapterNonExistentHelper.class;
    }

}
