package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIConnectorServerTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIConnectorServerTests<javax.management.remote.rmi.RMIConnectorServer> {

    @Override
    public javax.management.remote.rmi.RMIConnectorServer createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.remote.rmi.RMIConnectorServer] available.");
    }

}
