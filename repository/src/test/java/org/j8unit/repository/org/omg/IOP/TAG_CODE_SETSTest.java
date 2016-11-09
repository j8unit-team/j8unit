package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_CODE_SETS;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TAG_CODE_SETS} (by simply reusing the
 * J8Unit test interface {@link TAG_CODE_SETSTests}).
 */

@RunWith(J8Unit4.class)
public class TAG_CODE_SETSTest
implements TAG_CODE_SETSTests<TAG_CODE_SETS> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TAG_CODE_SETS]

    @Override
    public TAG_CODE_SETS createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.TAG_CODE_SETS], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TAG_CODE_SETS]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TAG_CODE_SETS]

}
