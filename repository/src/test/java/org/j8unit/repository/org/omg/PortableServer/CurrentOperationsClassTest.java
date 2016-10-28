package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.CurrentOperations;

@RunWith(J8Unit4.class)
public class CurrentOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.CurrentOperationsClassTests<CurrentOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.CurrentOperations]

    @Override
    public Class<CurrentOperations> createNewSUT() {
        return CurrentOperations.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.CurrentOperations]

}
