package org.j8unit.repository.org.omg.PortableServer.CurrentPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoContextHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.CurrentPackage.NoContextHelperClassTests<org.omg.PortableServer.CurrentPackage.NoContextHelper> {

    @Override
    public Class<org.omg.PortableServer.CurrentPackage.NoContextHelper> createNewSUT() {
        return org.omg.PortableServer.CurrentPackage.NoContextHelper.class;
    }

}
