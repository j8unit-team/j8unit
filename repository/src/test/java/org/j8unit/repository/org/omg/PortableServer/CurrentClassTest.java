package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentClassTest
implements org.j8unit.repository.org.omg.PortableServer.CurrentClassTests<org.omg.PortableServer.Current> {

    @Override
    public Class<org.omg.PortableServer.Current> createNewSUT() {
        return org.omg.PortableServer.Current.class;
    }

}
