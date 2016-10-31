package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.RequestProcessingPolicy;

@RunWith(J8Unit4.class)
public class RequestProcessingPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.RequestProcessingPolicyClassTests<RequestProcessingPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.RequestProcessingPolicy]

    @Override
    public Class<RequestProcessingPolicy> createNewSUT() {
        return RequestProcessingPolicy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.RequestProcessingPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.RequestProcessingPolicy]

}
