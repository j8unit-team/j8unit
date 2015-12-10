package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthenticationExceptionTest
implements org.j8unit.repository.javax.naming.AuthenticationExceptionTests<javax.naming.AuthenticationException> {

    @Override
    public javax.naming.AuthenticationException createNewSUT() {
        return new javax.naming.AuthenticationException();
    }

}
