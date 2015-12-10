package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.CurrentOperationsClassTests<org.omg.PortableServer.CurrentOperations> {

    @Override
    public Class<org.omg.PortableServer.CurrentOperations> createNewSUT() {
        return org.omg.PortableServer.CurrentOperations.class;
    }

}
