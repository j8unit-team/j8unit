package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RequestProcessingPolicyValueClassTest
implements org.j8unit.repository.org.omg.PortableServer.RequestProcessingPolicyValueClassTests<org.omg.PortableServer.RequestProcessingPolicyValue> {

    @Override
    public Class<org.omg.PortableServer.RequestProcessingPolicyValue> createNewSUT() {
        return org.omg.PortableServer.RequestProcessingPolicyValue.class;
    }

}
