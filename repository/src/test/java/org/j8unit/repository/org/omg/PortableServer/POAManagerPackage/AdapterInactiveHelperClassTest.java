package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterInactiveHelperClassTest
implements
org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelperClassTests<org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper> {

    @Override
    public Class<org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper> createNewSUT() {
        return org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper.class;
    }

}
