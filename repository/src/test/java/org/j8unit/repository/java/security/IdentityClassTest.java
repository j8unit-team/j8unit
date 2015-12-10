package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IdentityClassTest
implements org.j8unit.repository.java.security.IdentityClassTests<java.security.Identity> {

    @Override
    public Class<java.security.Identity> createNewSUT() {
        return java.security.Identity.class;
    }

}
