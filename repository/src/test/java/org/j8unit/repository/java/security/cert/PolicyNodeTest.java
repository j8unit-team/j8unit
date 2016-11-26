package org.j8unit.repository.java.security.cert;

import java.security.cert.PolicyNode;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PolicyNode} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.PolicyNodeTests}).
 */
@RunWith(J8Unit4.class)
public class PolicyNodeTest
implements PolicyNodeTests<PolicyNode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PolicyNode]

    @Override
    public PolicyNode createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.PolicyNode], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.PolicyNode]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.PolicyNode]

}
