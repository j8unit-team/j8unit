package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.BAD_POLICY_TYPE;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BAD_POLICY_TYPE} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.BAD_POLICY_TYPEClassTests}).
 */

@RunWith(J8Unit4.class)
public class BAD_POLICY_TYPEClassTest
implements BAD_POLICY_TYPEClassTests<BAD_POLICY_TYPE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.BAD_POLICY_TYPE]

    @Override
    public Class<BAD_POLICY_TYPE> createNewSUT() {
        return BAD_POLICY_TYPE.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.BAD_POLICY_TYPE]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.BAD_POLICY_TYPE]

}
