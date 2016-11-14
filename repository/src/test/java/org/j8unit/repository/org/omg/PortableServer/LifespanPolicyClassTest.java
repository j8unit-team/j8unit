package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.LifespanPolicy;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LifespanPolicy} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.LifespanPolicyClassTests}).
 */

@RunWith(J8Unit4.class)
public class LifespanPolicyClassTest
implements LifespanPolicyClassTests<LifespanPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.LifespanPolicy]

    @Override
    public Class<LifespanPolicy> createNewSUT() {
        return LifespanPolicy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.LifespanPolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.LifespanPolicy]

}
