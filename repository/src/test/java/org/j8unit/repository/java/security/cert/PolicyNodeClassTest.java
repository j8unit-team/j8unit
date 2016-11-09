package org.j8unit.repository.java.security.cert;

import java.security.cert.PolicyNode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PolicyNode} (by simply reusing the J8Unit
 * test interface {@link PolicyNodeClassTests}).
 */

@RunWith(J8Unit4.class)
public class PolicyNodeClassTest
implements PolicyNodeClassTests<PolicyNode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PolicyNode]

    @Override
    public Class<PolicyNode> createNewSUT() {
        return PolicyNode.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.PolicyNode]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PolicyNode]

}
