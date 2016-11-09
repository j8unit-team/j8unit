package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PRIVATE_MEMBER} (by simply reusing the
 * J8Unit test interface {@link PRIVATE_MEMBERClassTests}).
 */

@RunWith(J8Unit4.class)
public class PRIVATE_MEMBERClassTest
implements PRIVATE_MEMBERClassTests<PRIVATE_MEMBER> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.PRIVATE_MEMBER]

    @Override
    public Class<PRIVATE_MEMBER> createNewSUT() {
        return PRIVATE_MEMBER.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.PRIVATE_MEMBER]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.PRIVATE_MEMBER]

}
