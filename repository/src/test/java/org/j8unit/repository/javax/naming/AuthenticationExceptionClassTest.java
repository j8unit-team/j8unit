package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthenticationExceptionClassTest
implements org.j8unit.repository.javax.naming.AuthenticationExceptionClassTests<javax.naming.AuthenticationException> {

    @Override
    public Class<javax.naming.AuthenticationException> createNewSUT() {
        return javax.naming.AuthenticationException.class;
    }

}
