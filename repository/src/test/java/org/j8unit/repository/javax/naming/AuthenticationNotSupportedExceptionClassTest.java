package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthenticationNotSupportedExceptionClassTest
implements org.j8unit.repository.javax.naming.AuthenticationNotSupportedExceptionClassTests<javax.naming.AuthenticationNotSupportedException> {

    @Override
    public Class<javax.naming.AuthenticationNotSupportedException> createNewSUT() {
        return javax.naming.AuthenticationNotSupportedException.class;
    }

}
