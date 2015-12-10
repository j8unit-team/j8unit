package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIJRMPServerImplClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIJRMPServerImplClassTests<javax.management.remote.rmi.RMIJRMPServerImpl> {

    @Override
    public Class<javax.management.remote.rmi.RMIJRMPServerImpl> createNewSUT() {
        return javax.management.remote.rmi.RMIJRMPServerImpl.class;
    }

}
