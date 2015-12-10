package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.CallbackClassTests<javax.security.auth.callback.Callback> {

    @Override
    public Class<javax.security.auth.callback.Callback> createNewSUT() {
        return javax.security.auth.callback.Callback.class;
    }

}
