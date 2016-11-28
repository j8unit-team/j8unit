package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PRIVATE_MEMBER} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.PRIVATE_MEMBERTests}).
 */
@RunWith(J8Unit4.class)
public class PRIVATE_MEMBERTest
implements PRIVATE_MEMBERTests<PRIVATE_MEMBER> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.PRIVATE_MEMBER]

    @Override
    public PRIVATE_MEMBER createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.PRIVATE_MEMBER], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.PRIVATE_MEMBER]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.PRIVATE_MEMBER]

}
