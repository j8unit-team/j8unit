package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.NameCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NameCallback} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.callback.NameCallbackTests}).
 */

@RunWith(J8Unit4.class)
public class NameCallbackTest
implements NameCallbackTests<NameCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.NameCallback]

    @Override
    public NameCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.callback.NameCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.callback.NameCallback]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.callback.NameCallback]

}
