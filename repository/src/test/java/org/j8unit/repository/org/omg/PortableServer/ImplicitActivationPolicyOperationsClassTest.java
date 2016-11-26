package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ImplicitActivationPolicyOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImplicitActivationPolicyOperations} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.ImplicitActivationPolicyOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class ImplicitActivationPolicyOperationsClassTest
implements ImplicitActivationPolicyOperationsClassTests<ImplicitActivationPolicyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ImplicitActivationPolicyOperations]

    @Override
    public Class<ImplicitActivationPolicyOperations> createNewSUT() {
        return ImplicitActivationPolicyOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ImplicitActivationPolicyOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ImplicitActivationPolicyOperations]

}
