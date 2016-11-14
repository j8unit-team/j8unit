package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.RequestProcessingPolicy;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RequestProcessingPolicy} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.RequestProcessingPolicyClassTests}).
 */

@RunWith(J8Unit4.class)
public class RequestProcessingPolicyClassTest
implements RequestProcessingPolicyClassTests<RequestProcessingPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.RequestProcessingPolicy]

    @Override
    public Class<RequestProcessingPolicy> createNewSUT() {
        return RequestProcessingPolicy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.RequestProcessingPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.RequestProcessingPolicy]

}
