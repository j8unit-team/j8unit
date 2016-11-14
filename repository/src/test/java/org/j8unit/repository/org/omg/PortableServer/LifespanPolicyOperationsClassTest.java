package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.LifespanPolicyOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LifespanPolicyOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.LifespanPolicyOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class LifespanPolicyOperationsClassTest
implements LifespanPolicyOperationsClassTests<LifespanPolicyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.LifespanPolicyOperations]

    @Override
    public Class<LifespanPolicyOperations> createNewSUT() {
        return LifespanPolicyOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.LifespanPolicyOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.LifespanPolicyOperations]

}
