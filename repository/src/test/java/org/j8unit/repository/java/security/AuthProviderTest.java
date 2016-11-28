package org.j8unit.repository.java.security;

import java.security.AuthProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AuthProvider} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.AuthProviderTests}).
 */
@RunWith(J8Unit4.class)
public class AuthProviderTest
implements AuthProviderTests<AuthProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.AuthProvider]

    @Override
    public AuthProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.AuthProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.AuthProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.AuthProvider]

}
