package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongAdapterClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongAdapterClassTests<org.omg.PortableServer.POAPackage.WrongAdapter> {

    @Override
    public Class<org.omg.PortableServer.POAPackage.WrongAdapter> createNewSUT() {
        return org.omg.PortableServer.POAPackage.WrongAdapter.class;
    }

}
