package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.BAD_POLICY_VALUE;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BAD_POLICY_VALUE} (by simply reusing the
 * J8Unit test interface {@link BAD_POLICY_VALUEClassTests}).
 */

@RunWith(J8Unit4.class)
public class BAD_POLICY_VALUEClassTest
implements BAD_POLICY_VALUEClassTests<BAD_POLICY_VALUE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.BAD_POLICY_VALUE]

    @Override
    public Class<BAD_POLICY_VALUE> createNewSUT() {
        return BAD_POLICY_VALUE.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.BAD_POLICY_VALUE]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.BAD_POLICY_VALUE]

}
