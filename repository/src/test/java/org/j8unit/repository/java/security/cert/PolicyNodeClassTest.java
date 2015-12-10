package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyNodeClassTest
implements org.j8unit.repository.java.security.cert.PolicyNodeClassTests<java.security.cert.PolicyNode> {

    @Override
    public Class<java.security.cert.PolicyNode> createNewSUT() {
        return java.security.cert.PolicyNode.class;
    }

}
