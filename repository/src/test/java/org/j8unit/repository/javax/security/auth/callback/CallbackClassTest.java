package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.Callback;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CallbackClassTest
implements org.j8unit.repository.javax.security.auth.callback.CallbackClassTests<Callback> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.callback.Callback]

    @Override
    public Class<Callback> createNewSUT() {
        return Callback.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.callback.Callback]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.callback.Callback]

}
