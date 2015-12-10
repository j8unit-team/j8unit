package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrincipalClassTest
implements org.j8unit.repository.java.security.PrincipalClassTests<java.security.Principal> {

    @Override
    public Class<java.security.Principal> createNewSUT() {
        return java.security.Principal.class;
    }

}
