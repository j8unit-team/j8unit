package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIConnectionClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIConnectionClassTests<RMIConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi.RMIConnection]

    @Override
    public Class<RMIConnection> createNewSUT() {
        return RMIConnection.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi.RMIConnection]

}
