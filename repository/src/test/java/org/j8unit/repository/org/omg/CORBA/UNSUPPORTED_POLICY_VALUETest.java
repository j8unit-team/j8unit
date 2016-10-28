package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.UNSUPPORTED_POLICY_VALUE;

@RunWith(J8Unit4.class)
public class UNSUPPORTED_POLICY_VALUETest
implements org.j8unit.repository.org.omg.CORBA.UNSUPPORTED_POLICY_VALUETests<UNSUPPORTED_POLICY_VALUE> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.UNSUPPORTED_POLICY_VALUE]

    @Override
    public UNSUPPORTED_POLICY_VALUE createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.UNSUPPORTED_POLICY_VALUE], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.UNSUPPORTED_POLICY_VALUE]

}
