package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.ChoiceCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChoiceCallbackTest
implements org.j8unit.repository.javax.security.auth.callback.ChoiceCallbackTests<ChoiceCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.ChoiceCallback]

    @Override
    public ChoiceCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.callback.ChoiceCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.callback.ChoiceCallback]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.callback.ChoiceCallback]

}
