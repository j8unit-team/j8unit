package org.j8unit.repository.javax.security.auth.login;

import javax.security.auth.login.LoginContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoginContextTest
implements org.j8unit.repository.javax.security.auth.login.LoginContextTests<LoginContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.login.LoginContext]

    @Override
    public LoginContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.login.LoginContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.login.LoginContext]

}
