package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.Current;

@RunWith(J8Unit4.class)
public class CurrentClassTest
implements org.j8unit.repository.org.omg.PortableServer.CurrentClassTests<Current> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.Current]

    @Override
    public Class<Current> createNewSUT() {
        return Current.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.Current]

}
