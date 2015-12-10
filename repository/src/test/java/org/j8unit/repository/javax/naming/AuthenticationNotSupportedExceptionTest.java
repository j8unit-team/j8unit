package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthenticationNotSupportedExceptionTest
implements org.j8unit.repository.javax.naming.AuthenticationNotSupportedExceptionTests<javax.naming.AuthenticationNotSupportedException> {

    @Override
    public javax.naming.AuthenticationNotSupportedException createNewSUT() {
        return new javax.naming.AuthenticationNotSupportedException();
    }

}
