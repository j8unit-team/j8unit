package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.WCharSeqHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WCharSeqHelper} (by simply reusing
 * the J8Unit test interface {@link WCharSeqHelperTests}).
 */

@RunWith(J8Unit4.class)
public class WCharSeqHelperTest
implements WCharSeqHelperTests<WCharSeqHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.WCharSeqHelper]

    @Override
    public WCharSeqHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.WCharSeqHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.WCharSeqHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.WCharSeqHelper]

}
