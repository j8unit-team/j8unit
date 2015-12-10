package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIServerImplClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIServerImplClassTests<javax.management.remote.rmi.RMIServerImpl> {

    @Override
    public Class<javax.management.remote.rmi.RMIServerImpl> createNewSUT() {
        return javax.management.remote.rmi.RMIServerImpl.class;
    }

}
