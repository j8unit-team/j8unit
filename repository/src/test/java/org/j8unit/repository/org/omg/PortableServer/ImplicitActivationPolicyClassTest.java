package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ImplicitActivationPolicy;

@RunWith(J8Unit4.class)
public class ImplicitActivationPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.ImplicitActivationPolicyClassTests<ImplicitActivationPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ImplicitActivationPolicy]

    @Override
    public Class<ImplicitActivationPolicy> createNewSUT() {
        return ImplicitActivationPolicy.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ImplicitActivationPolicy]

}
