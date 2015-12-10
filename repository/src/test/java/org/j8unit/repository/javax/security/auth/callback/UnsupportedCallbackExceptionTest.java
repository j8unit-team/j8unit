package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedCallbackExceptionTest
implements org.j8unit.repository.javax.security.auth.callback.UnsupportedCallbackExceptionTests<javax.security.auth.callback.UnsupportedCallbackException> {

    @Override
    public javax.security.auth.callback.UnsupportedCallbackException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.security.auth.callback.UnsupportedCallbackException] available.");
    }

}
