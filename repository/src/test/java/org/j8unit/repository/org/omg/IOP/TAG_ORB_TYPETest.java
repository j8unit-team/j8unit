package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_ORB_TYPE;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TAG_ORB_TYPE} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.TAG_ORB_TYPETests}).
 */
@RunWith(J8Unit4.class)
public class TAG_ORB_TYPETest
implements TAG_ORB_TYPETests<TAG_ORB_TYPE> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TAG_ORB_TYPE]

    @Override
    public TAG_ORB_TYPE createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.TAG_ORB_TYPE], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TAG_ORB_TYPE]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TAG_ORB_TYPE]

}
