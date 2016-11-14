package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ImplicitActivationPolicy;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImplicitActivationPolicy} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.ImplicitActivationPolicyClassTests}).
 */

@RunWith(J8Unit4.class)
public class ImplicitActivationPolicyClassTest
implements ImplicitActivationPolicyClassTests<ImplicitActivationPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ImplicitActivationPolicy]

    @Override
    public Class<ImplicitActivationPolicy> createNewSUT() {
        return ImplicitActivationPolicy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ImplicitActivationPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ImplicitActivationPolicy]

}
