package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthenticationExceptionTest
implements org.j8unit.repository.javax.security.sasl.AuthenticationExceptionTests<javax.security.sasl.AuthenticationException> {

    @Override
    public javax.security.sasl.AuthenticationException createNewSUT() {
        return new javax.security.sasl.AuthenticationException();
    }

}
