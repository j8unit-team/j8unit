package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIConnectionImplClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIConnectionImplClassTests<javax.management.remote.rmi.RMIConnectionImpl> {

    @Override
    public Class<javax.management.remote.rmi.RMIConnectionImpl> createNewSUT() {
        return javax.management.remote.rmi.RMIConnectionImpl.class;
    }

}
