package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextOutputCallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.TextOutputCallbackClassTests<javax.security.auth.callback.TextOutputCallback> {

    @Override
    public Class<javax.security.auth.callback.TextOutputCallback> createNewSUT() {
        return javax.security.auth.callback.TextOutputCallback.class;
    }

}
