package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthProviderClassTest
implements org.j8unit.repository.java.security.AuthProviderClassTests<java.security.AuthProvider> {

    @Override
    public Class<java.security.AuthProvider> createNewSUT() {
        return java.security.AuthProvider.class;
    }

}
