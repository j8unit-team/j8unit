package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.CallbackHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CallbackHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.callback.CallbackHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class CallbackHandlerClassTest
implements CallbackHandlerClassTests<CallbackHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.callback.CallbackHandler]

    @Override
    public Class<CallbackHandler> createNewSUT() {
        return CallbackHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.callback.CallbackHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.callback.CallbackHandler]

}
