package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.LifespanPolicyOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LifespanPolicyOperations} (by simply
 * reusing the J8Unit test interface {@link LifespanPolicyOperationsTests}).
 */

@RunWith(J8Unit4.class)
public class LifespanPolicyOperationsTest
implements LifespanPolicyOperationsTests<LifespanPolicyOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.LifespanPolicyOperations]

    @Override
    public LifespanPolicyOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.LifespanPolicyOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.LifespanPolicyOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.LifespanPolicyOperations]

}
