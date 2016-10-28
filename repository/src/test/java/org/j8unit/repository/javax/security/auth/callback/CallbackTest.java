package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.Callback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CallbackTest
implements org.j8unit.repository.javax.security.auth.callback.CallbackTests<Callback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.Callback]

    @Override
    public Callback createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.auth.callback.Callback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.callback.Callback]

}
