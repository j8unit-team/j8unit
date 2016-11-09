package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.InvalidSlotHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InvalidSlotHelper} (by simply reusing
 * the J8Unit test interface {@link InvalidSlotHelperTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidSlotHelperTest
implements InvalidSlotHelperTests<InvalidSlotHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.InvalidSlotHelper]

    @Override
    public InvalidSlotHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.InvalidSlotHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.InvalidSlotHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.InvalidSlotHelper]

}
