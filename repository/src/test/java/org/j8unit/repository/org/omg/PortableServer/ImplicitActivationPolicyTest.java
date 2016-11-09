package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ImplicitActivationPolicy;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImplicitActivationPolicy} (by simply
 * reusing the J8Unit test interface {@link ImplicitActivationPolicyTests}).
 */

@RunWith(J8Unit4.class)
public class ImplicitActivationPolicyTest
implements ImplicitActivationPolicyTests<ImplicitActivationPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ImplicitActivationPolicy]

    @Override
    public ImplicitActivationPolicy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.ImplicitActivationPolicy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.ImplicitActivationPolicy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.ImplicitActivationPolicy]

}
