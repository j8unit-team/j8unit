package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LanguageCallbackTest
implements org.j8unit.repository.javax.security.auth.callback.LanguageCallbackTests<javax.security.auth.callback.LanguageCallback> {

    @Override
    public javax.security.auth.callback.LanguageCallback createNewSUT() {
        return new javax.security.auth.callback.LanguageCallback();
    }

}
