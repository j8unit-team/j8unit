package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterInactiveClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.AdapterInactiveClassTests<org.omg.PortableServer.POAManagerPackage.AdapterInactive> {

    @Override
    public Class<org.omg.PortableServer.POAManagerPackage.AdapterInactive> createNewSUT() {
        return org.omg.PortableServer.POAManagerPackage.AdapterInactive.class;
    }

}
