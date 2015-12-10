package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentHelperClassTest
implements org.j8unit.repository.org.omg.PortableServer.CurrentHelperClassTests<org.omg.PortableServer.CurrentHelper> {

    @Override
    public Class<org.omg.PortableServer.CurrentHelper> createNewSUT() {
        return org.omg.PortableServer.CurrentHelper.class;
    }

}
