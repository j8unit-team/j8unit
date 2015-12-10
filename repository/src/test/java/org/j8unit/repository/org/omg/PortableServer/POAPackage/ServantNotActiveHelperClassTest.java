package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantNotActiveHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ServantNotActiveHelperClassTests<org.omg.PortableServer.POAPackage.ServantNotActiveHelper> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.ServantNotActiveHelper> createNewSUT() {
        return org.omg.PortableServer.POAPackage.ServantNotActiveHelper.class;
    }

}
