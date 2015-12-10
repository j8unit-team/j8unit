package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextInputCallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.TextInputCallbackClassTests<javax.security.auth.callback.TextInputCallback> {

    @Override
    public Class<javax.security.auth.callback.TextInputCallback> createNewSUT() {
        return javax.security.auth.callback.TextInputCallback.class;
    }

}
