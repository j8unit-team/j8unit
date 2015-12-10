package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProtectionDomainClassTest
implements org.j8unit.repository.java.security.ProtectionDomainClassTests<java.security.ProtectionDomain> {

    @Override
    public Class<java.security.ProtectionDomain> createNewSUT() {
        return java.security.ProtectionDomain.class;
    }

}
