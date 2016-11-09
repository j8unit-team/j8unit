package org.j8unit.repository.javax.security.auth;

import javax.security.auth.AuthPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AuthPermission} (by simply reusing
 * the J8Unit test interface {@link AuthPermissionTests}).
 */

@RunWith(J8Unit4.class)
public class AuthPermissionTest
implements AuthPermissionTests<AuthPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.AuthPermission]

    @Override
    public AuthPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.AuthPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.AuthPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.AuthPermission]

}
