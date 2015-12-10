package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChoiceCallbackTest
implements org.j8unit.repository.javax.security.auth.callback.ChoiceCallbackTests<javax.security.auth.callback.ChoiceCallback> {

    @Override
    public javax.security.auth.callback.ChoiceCallback createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.security.auth.callback.ChoiceCallback] available.");
    }

}
