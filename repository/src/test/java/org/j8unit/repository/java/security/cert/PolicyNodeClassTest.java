package org.j8unit.repository.java.security.cert;

import java.security.cert.PolicyNode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyNodeClassTest
implements org.j8unit.repository.java.security.cert.PolicyNodeClassTests<PolicyNode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PolicyNode]

    @Override
    public Class<PolicyNode> createNewSUT() {
        return PolicyNode.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.PolicyNode]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PolicyNode]

}
