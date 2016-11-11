package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.CallbackHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CallbackHandler} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.security.auth.callback.CallbackHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class CallbackHandlerTest
implements CallbackHandlerTests<CallbackHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.CallbackHandler]

    @Override
    public CallbackHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.auth.callback.CallbackHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.callback.CallbackHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.callback.CallbackHandler]

}
