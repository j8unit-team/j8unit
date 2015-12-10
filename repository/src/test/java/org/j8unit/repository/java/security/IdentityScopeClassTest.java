package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IdentityScopeClassTest
implements org.j8unit.repository.java.security.IdentityScopeClassTests<java.security.IdentityScope> {

    @Override
    public Class<java.security.IdentityScope> createNewSUT() {
        return java.security.IdentityScope.class;
    }

}
