package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicySpiClassTest
implements org.j8unit.repository.java.security.PolicySpiClassTests<java.security.PolicySpi> {

    @Override
    public Class<java.security.PolicySpi> createNewSUT() {
        return java.security.PolicySpi.class;
    }

}
