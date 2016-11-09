package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.ShortSeqHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ShortSeqHelper} (by simply reusing
 * the J8Unit test interface {@link ShortSeqHelperTests}).
 */

@RunWith(J8Unit4.class)
public class ShortSeqHelperTest
implements ShortSeqHelperTests<ShortSeqHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ShortSeqHelper]

    @Override
    public ShortSeqHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.ShortSeqHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.ShortSeqHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.ShortSeqHelper]

}
