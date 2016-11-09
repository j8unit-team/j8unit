package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TAG_ALTERNATE_IIOP_ADDRESS} (by
 * simply reusing the J8Unit test interface {@link TAG_ALTERNATE_IIOP_ADDRESSTests}).
 */

@RunWith(J8Unit4.class)
public class TAG_ALTERNATE_IIOP_ADDRESSTest
implements TAG_ALTERNATE_IIOP_ADDRESSTests<TAG_ALTERNATE_IIOP_ADDRESS> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS]

    @Override
    public TAG_ALTERNATE_IIOP_ADDRESS createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS]

}
