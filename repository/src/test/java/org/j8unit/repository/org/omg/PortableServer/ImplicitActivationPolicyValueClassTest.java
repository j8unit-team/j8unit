package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImplicitActivationPolicyValueClassTest
implements org.j8unit.repository.org.omg.PortableServer.ImplicitActivationPolicyValueClassTests<org.omg.PortableServer.ImplicitActivationPolicyValue> {

    @Override
    public Class<org.omg.PortableServer.ImplicitActivationPolicyValue> createNewSUT() {
        return org.omg.PortableServer.ImplicitActivationPolicyValue.class;
    }

}
