package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameCallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.NameCallbackClassTests<javax.security.auth.callback.NameCallback> {

    @Override
    public Class<javax.security.auth.callback.NameCallback> createNewSUT() {
        return javax.security.auth.callback.NameCallback.class;
    }

}
