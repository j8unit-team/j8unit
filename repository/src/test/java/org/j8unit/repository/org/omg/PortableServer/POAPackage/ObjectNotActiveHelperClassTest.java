package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectNotActiveHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ObjectNotActiveHelperClassTests<org.omg.PortableServer.POAPackage.ObjectNotActiveHelper> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.ObjectNotActiveHelper> createNewSUT() {
        return org.omg.PortableServer.POAPackage.ObjectNotActiveHelper.class;
    }

}
