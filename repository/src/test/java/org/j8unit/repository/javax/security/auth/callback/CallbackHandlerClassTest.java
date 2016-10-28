package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.CallbackHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CallbackHandlerClassTest
implements org.j8unit.repository.javax.security.auth.callback.CallbackHandlerClassTests<CallbackHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.callback.CallbackHandler]

    @Override
    public Class<CallbackHandler> createNewSUT() {
        return CallbackHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.callback.CallbackHandler]

}
