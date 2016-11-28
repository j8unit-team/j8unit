package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.UNSUPPORTED_POLICY_VALUE;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UNSUPPORTED_POLICY_VALUE} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.UNSUPPORTED_POLICY_VALUETests}).
 */
@RunWith(J8Unit4.class)
public class UNSUPPORTED_POLICY_VALUETest
implements UNSUPPORTED_POLICY_VALUETests<UNSUPPORTED_POLICY_VALUE> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.UNSUPPORTED_POLICY_VALUE]

    @Override
    public UNSUPPORTED_POLICY_VALUE createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.UNSUPPORTED_POLICY_VALUE], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.UNSUPPORTED_POLICY_VALUE]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.UNSUPPORTED_POLICY_VALUE]

}
