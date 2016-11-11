package org.j8unit.repository.javax.security.auth.login;

import javax.security.auth.login.LoginContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LoginContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.login.LoginContextTests}).
 */

@RunWith(J8Unit4.class)
public class LoginContextTest
implements LoginContextTests<LoginContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.login.LoginContext]

    @Override
    public LoginContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.login.LoginContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.login.LoginContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.login.LoginContext]

}
