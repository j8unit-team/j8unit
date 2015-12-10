package org.j8unit.repository.org.omg.PortableServer.CurrentPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoContextClassTest
implements org.j8unit.repository.org.omg.PortableServer.CurrentPackage.NoContextClassTests<org.omg.PortableServer.CurrentPackage.NoContext> {

    @Override
    public Class<org.omg.PortableServer.CurrentPackage.NoContext> createNewSUT() {
        return org.omg.PortableServer.CurrentPackage.NoContext.class;
    }

}
