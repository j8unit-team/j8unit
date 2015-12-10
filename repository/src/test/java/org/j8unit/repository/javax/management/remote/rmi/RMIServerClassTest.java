package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIServerClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIServerClassTests<javax.management.remote.rmi.RMIServer> {

    @Override
    public Class<javax.management.remote.rmi.RMIServer> createNewSUT() {
        return javax.management.remote.rmi.RMIServer.class;
    }

}
