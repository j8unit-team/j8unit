package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.TextInputCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TextInputCallback} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.security.auth.callback.TextInputCallbackTests}).
 */
@RunWith(J8Unit4.class)
public class TextInputCallbackTest
implements TextInputCallbackTests<TextInputCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.TextInputCallback]

    @Override
    public TextInputCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.callback.TextInputCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.callback.TextInputCallback]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.callback.TextInputCallback]

}
