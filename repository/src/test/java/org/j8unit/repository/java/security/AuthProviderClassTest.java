package org.j8unit.repository.java.security;

import java.security.AuthProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AuthProvider} (by simply reusing the
 * J8Unit test interface {@link AuthProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class AuthProviderClassTest
implements AuthProviderClassTests<AuthProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.AuthProvider]

    @Override
    public Class<AuthProvider> createNewSUT() {
        return AuthProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.AuthProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.AuthProvider]

}
