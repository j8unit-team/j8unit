package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChoiceCallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.ChoiceCallbackClassTests<javax.security.auth.callback.ChoiceCallback> {

    @Override
    public Class<javax.security.auth.callback.ChoiceCallback> createNewSUT() {
        return javax.security.auth.callback.ChoiceCallback.class;
    }

}
