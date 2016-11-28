package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.TextOutputCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TextOutputCallback} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.security.auth.callback.TextOutputCallbackTests}).
 */
@RunWith(J8Unit4.class)
public class TextOutputCallbackTest
implements TextOutputCallbackTests<TextOutputCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.TextOutputCallback]

    @Override
    public TextOutputCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.callback.TextOutputCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.callback.TextOutputCallback]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.callback.TextOutputCallback]

}
