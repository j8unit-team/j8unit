package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PasswordCallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.PasswordCallbackClassTests<javax.security.auth.callback.PasswordCallback> {

    @Override
    public Class<javax.security.auth.callback.PasswordCallback> createNewSUT() {
        return javax.security.auth.callback.PasswordCallback.class;
    }

}
