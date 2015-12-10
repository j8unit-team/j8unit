package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StateClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.StateClassTests<org.omg.PortableServer.POAManagerPackage.State> {

    @Override
    public Class<org.omg.PortableServer.POAManagerPackage.State> createNewSUT() {
        return org.omg.PortableServer.POAManagerPackage.State.class;
    }

}
