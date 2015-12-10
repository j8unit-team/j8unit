package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadPolicyOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.ThreadPolicyOperationsClassTests<org.omg.PortableServer.ThreadPolicyOperations> {

    @Override
    public Class<org.omg.PortableServer.ThreadPolicyOperations> createNewSUT() {
        return org.omg.PortableServer.ThreadPolicyOperations.class;
    }

}
