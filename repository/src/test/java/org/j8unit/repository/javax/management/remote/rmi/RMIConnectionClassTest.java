package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIConnectionClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIConnectionClassTests<javax.management.remote.rmi.RMIConnection> {

    @Override
    public Class<javax.management.remote.rmi.RMIConnection> createNewSUT() {
        return javax.management.remote.rmi.RMIConnection.class;
    }

}
