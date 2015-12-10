package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImplicitActivationPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.ImplicitActivationPolicyClassTests<org.omg.PortableServer.ImplicitActivationPolicy> {

    @Override
    public Class<org.omg.PortableServer.ImplicitActivationPolicy> createNewSUT() {
        return org.omg.PortableServer.ImplicitActivationPolicy.class;
    }

}
