package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_CODE_SETS;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TAG_CODE_SETS} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.TAG_CODE_SETSClassTests}).
 */

@RunWith(J8Unit4.class)
public class TAG_CODE_SETSClassTest
implements TAG_CODE_SETSClassTests<TAG_CODE_SETS> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TAG_CODE_SETS]

    @Override
    public Class<TAG_CODE_SETS> createNewSUT() {
        return TAG_CODE_SETS.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.TAG_CODE_SETS]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TAG_CODE_SETS]

}
