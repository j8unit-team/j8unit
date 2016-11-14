package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.RequestProcessingPolicyOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RequestProcessingPolicyOperations} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.RequestProcessingPolicyOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class RequestProcessingPolicyOperationsClassTest
implements RequestProcessingPolicyOperationsClassTests<RequestProcessingPolicyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.RequestProcessingPolicyOperations]

    @Override
    public Class<RequestProcessingPolicyOperations> createNewSUT() {
        return RequestProcessingPolicyOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.RequestProcessingPolicyOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.RequestProcessingPolicyOperations]

}
