package org.j8unit.repository.javax.naming;

import javax.naming.Context;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContextTest
implements org.j8unit.repository.javax.naming.ContextTests<Context> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.Context]

    @Override
    public Context createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.Context], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.Context]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.Context]

}
