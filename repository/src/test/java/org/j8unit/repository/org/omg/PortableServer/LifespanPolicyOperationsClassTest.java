package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LifespanPolicyOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.LifespanPolicyOperationsClassTests<org.omg.PortableServer.LifespanPolicyOperations> {

    @Override
    public Class<org.omg.PortableServer.LifespanPolicyOperations> createNewSUT() {
        return org.omg.PortableServer.LifespanPolicyOperations.class;
    }

}
