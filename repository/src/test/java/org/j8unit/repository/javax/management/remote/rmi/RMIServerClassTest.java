package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIServer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIServerClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIServerClassTests<RMIServer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi.RMIServer]

    @Override
    public Class<RMIServer> createNewSUT() {
        return RMIServer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.rmi.RMIServer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi.RMIServer]

}
