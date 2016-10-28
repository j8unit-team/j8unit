package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.RequestProcessingPolicy;

@RunWith(J8Unit4.class)
public class RequestProcessingPolicyTest
implements org.j8unit.repository.org.omg.PortableServer.RequestProcessingPolicyTests<RequestProcessingPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.RequestProcessingPolicy]

    @Override
    public RequestProcessingPolicy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.RequestProcessingPolicy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.RequestProcessingPolicy]

}
