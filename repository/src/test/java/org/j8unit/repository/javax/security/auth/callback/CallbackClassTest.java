package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.Callback;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Callback} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.security.auth.callback.CallbackClassTests}).
 */
@RunWith(J8Unit4.class)
public class CallbackClassTest
implements CallbackClassTests<Callback> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.callback.Callback]

    @Override
    public Class<Callback> createNewSUT() {
        return Callback.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.callback.Callback]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.callback.Callback]

}
