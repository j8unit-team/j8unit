package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongAdapterHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongAdapterHelperClassTests<org.omg.PortableServer.POAPackage.WrongAdapterHelper> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.WrongAdapterHelper> createNewSUT() {
        return org.omg.PortableServer.POAPackage.WrongAdapterHelper.class;
    }

}
