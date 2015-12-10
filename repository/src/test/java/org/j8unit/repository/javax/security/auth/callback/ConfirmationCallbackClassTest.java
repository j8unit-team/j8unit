package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConfirmationCallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.ConfirmationCallbackClassTests<javax.security.auth.callback.ConfirmationCallback> {

    @Override
    public Class<javax.security.auth.callback.ConfirmationCallback> createNewSUT() {
        return javax.security.auth.callback.ConfirmationCallback.class;
    }

}
