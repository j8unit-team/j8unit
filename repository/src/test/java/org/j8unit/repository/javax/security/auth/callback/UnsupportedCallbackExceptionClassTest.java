package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedCallbackExceptionClassTest
implements
org.j8unit.repository.javax.security.auth.callback.UnsupportedCallbackExceptionClassTests<javax.security.auth.callback.UnsupportedCallbackException> {

    @Override
    public Class<javax.security.auth.callback.UnsupportedCallbackException> createNewSUT() {
        return javax.security.auth.callback.UnsupportedCallbackException.class;
    }

}
