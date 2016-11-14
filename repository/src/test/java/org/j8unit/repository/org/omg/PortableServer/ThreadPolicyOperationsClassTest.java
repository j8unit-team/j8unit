package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ThreadPolicyOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ThreadPolicyOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.ThreadPolicyOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class ThreadPolicyOperationsClassTest
implements ThreadPolicyOperationsClassTests<ThreadPolicyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ThreadPolicyOperations]

    @Override
    public Class<ThreadPolicyOperations> createNewSUT() {
        return ThreadPolicyOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ThreadPolicyOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ThreadPolicyOperations]

}
