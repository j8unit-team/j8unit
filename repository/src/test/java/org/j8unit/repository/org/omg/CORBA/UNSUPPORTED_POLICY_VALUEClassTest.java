package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.UNSUPPORTED_POLICY_VALUE;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UNSUPPORTED_POLICY_VALUE} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.UNSUPPORTED_POLICY_VALUEClassTests}).
 */
@RunWith(J8Unit4.class)
public class UNSUPPORTED_POLICY_VALUEClassTest
implements UNSUPPORTED_POLICY_VALUEClassTests<UNSUPPORTED_POLICY_VALUE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.UNSUPPORTED_POLICY_VALUE]

    @Override
    public Class<UNSUPPORTED_POLICY_VALUE> createNewSUT() {
        return UNSUPPORTED_POLICY_VALUE.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.UNSUPPORTED_POLICY_VALUE]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.UNSUPPORTED_POLICY_VALUE]

}
