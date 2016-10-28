package org.j8unit.repository.java.security;

import java.security.AuthProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthProviderClassTest
implements org.j8unit.repository.java.security.AuthProviderClassTests<AuthProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.AuthProvider]

    @Override
    public Class<AuthProvider> createNewSUT() {
        return AuthProvider.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.AuthProvider]

}
