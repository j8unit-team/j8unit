package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIConnectorClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIConnectorClassTests<javax.management.remote.rmi.RMIConnector> {

    @Override
    public Class<javax.management.remote.rmi.RMIConnector> createNewSUT() {
        return javax.management.remote.rmi.RMIConnector.class;
    }

}
