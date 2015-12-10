package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongAdapterTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongAdapterTests<org.omg.PortableServer.POAPackage.WrongAdapter> {

    @Override
    public org.omg.PortableServer.POAPackage.WrongAdapter createNewSUT() {
        return new org.omg.PortableServer.POAPackage.WrongAdapter();
    }

}
