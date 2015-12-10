package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CallbackHandlerClassTest
implements org.j8unit.repository.javax.security.auth.callback.CallbackHandlerClassTests<javax.security.auth.callback.CallbackHandler> {

    @Override
    public Class<javax.security.auth.callback.CallbackHandler> createNewSUT() {
        return javax.security.auth.callback.CallbackHandler.class;
    }

}
