package org.j8unit.repository.org.omg.PortableServer.CurrentPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoContextTest
implements org.j8unit.repository.org.omg.PortableServer.CurrentPackage.NoContextTests<org.omg.PortableServer.CurrentPackage.NoContext> {

    @Override
    public org.omg.PortableServer.CurrentPackage.NoContext createNewSUT() {
        return new org.omg.PortableServer.CurrentPackage.NoContext();
    }

}
