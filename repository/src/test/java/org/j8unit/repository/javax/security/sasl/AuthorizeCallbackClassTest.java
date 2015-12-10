package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AuthorizeCallbackClassTest
implements org.j8unit.repository.javax.security.sasl.AuthorizeCallbackClassTests<javax.security.sasl.AuthorizeCallback> {

    @Override
    public Class<javax.security.sasl.AuthorizeCallback> createNewSUT() {
        return javax.security.sasl.AuthorizeCallback.class;
    }

}
