package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIConnectorTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIConnectorTests<javax.management.remote.rmi.RMIConnector> {

    @Override
    public javax.management.remote.rmi.RMIConnector createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.remote.rmi.RMIConnector] available.");
    }

}
