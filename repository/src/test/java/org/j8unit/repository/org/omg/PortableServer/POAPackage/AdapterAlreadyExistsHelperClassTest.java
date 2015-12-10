package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterAlreadyExistsHelperClassTest
implements
org.j8unit.repository.org.omg.PortableServer.POAPackage.AdapterAlreadyExistsHelperClassTests<org.omg.PortableServer.POAPackage.AdapterAlreadyExistsHelper> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.AdapterAlreadyExistsHelper> createNewSUT() {
        return org.omg.PortableServer.POAPackage.AdapterAlreadyExistsHelper.class;
    }

}
