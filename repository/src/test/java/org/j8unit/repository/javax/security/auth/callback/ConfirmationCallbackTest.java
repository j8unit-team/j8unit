package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.ConfirmationCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConfirmationCallbackTest
implements org.j8unit.repository.javax.security.auth.callback.ConfirmationCallbackTests<ConfirmationCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.ConfirmationCallback]

    @Override
    public ConfirmationCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.callback.ConfirmationCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.callback.ConfirmationCallback]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.callback.ConfirmationCallback]

}
