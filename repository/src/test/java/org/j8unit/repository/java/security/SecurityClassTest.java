package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecurityClassTest
implements org.j8unit.repository.java.security.SecurityClassTests<java.security.Security> {

    @Override
    public Class<java.security.Security> createNewSUT() {
        return java.security.Security.class;
    }

}
