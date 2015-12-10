package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthenticationExceptionClassTest
implements org.j8unit.repository.javax.security.sasl.AuthenticationExceptionClassTests<javax.security.sasl.AuthenticationException> {

    @Override
    public Class<javax.security.sasl.AuthenticationException> createNewSUT() {
        return javax.security.sasl.AuthenticationException.class;
    }

}
