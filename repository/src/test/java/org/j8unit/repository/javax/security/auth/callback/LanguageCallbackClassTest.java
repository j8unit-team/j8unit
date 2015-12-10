package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LanguageCallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.LanguageCallbackClassTests<javax.security.auth.callback.LanguageCallback> {

    @Override
    public Class<javax.security.auth.callback.LanguageCallback> createNewSUT() {
        return javax.security.auth.callback.LanguageCallback.class;
    }

}
