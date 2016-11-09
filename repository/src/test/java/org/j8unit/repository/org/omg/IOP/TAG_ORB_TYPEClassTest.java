package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_ORB_TYPE;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TAG_ORB_TYPE} (by simply reusing the
 * J8Unit test interface {@link TAG_ORB_TYPEClassTests}).
 */

@RunWith(J8Unit4.class)
public class TAG_ORB_TYPEClassTest
implements TAG_ORB_TYPEClassTests<TAG_ORB_TYPE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TAG_ORB_TYPE]

    @Override
    public Class<TAG_ORB_TYPE> createNewSUT() {
        return TAG_ORB_TYPE.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.TAG_ORB_TYPE]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TAG_ORB_TYPE]

}
