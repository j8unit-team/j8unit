package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.LifespanPolicyOperations;

@RunWith(J8Unit4.class)
public class LifespanPolicyOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.LifespanPolicyOperationsClassTests<LifespanPolicyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.LifespanPolicyOperations]

    @Override
    public Class<LifespanPolicyOperations> createNewSUT() {
        return LifespanPolicyOperations.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.LifespanPolicyOperations]

}
