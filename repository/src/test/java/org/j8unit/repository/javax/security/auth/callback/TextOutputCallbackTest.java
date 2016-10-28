package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.TextOutputCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextOutputCallbackTest
implements org.j8unit.repository.javax.security.auth.callback.TextOutputCallbackTests<TextOutputCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.TextOutputCallback]

    @Override
    public TextOutputCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.callback.TextOutputCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.TextOutputCallback]

}
