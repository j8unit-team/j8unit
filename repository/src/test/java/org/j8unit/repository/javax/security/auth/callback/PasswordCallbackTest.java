package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.PasswordCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PasswordCallback} (by simply reusing
 * the J8Unit test interface {@link PasswordCallbackTests}).
 */

@RunWith(J8Unit4.class)
public class PasswordCallbackTest
implements PasswordCallbackTests<PasswordCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.PasswordCallback]

    @Override
    public PasswordCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.callback.PasswordCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.callback.PasswordCallback]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.callback.PasswordCallback]

}
