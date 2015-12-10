package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterInactiveTest
implements org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.AdapterInactiveTests<org.omg.PortableServer.POAManagerPackage.AdapterInactive> {

    @Override
    public org.omg.PortableServer.POAManagerPackage.AdapterInactive createNewSUT() {
        return new org.omg.PortableServer.POAManagerPackage.AdapterInactive();
    }

}
