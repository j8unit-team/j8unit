package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynStructHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DynStructHelper} (by simply reusing
 * the J8Unit test interface {@link DynStructHelperTests}).
 */

@RunWith(J8Unit4.class)
public class DynStructHelperTest
implements DynStructHelperTests<DynStructHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.DynStructHelper]

    @Override
    public DynStructHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.DynamicAny.DynStructHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.DynStructHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.DynStructHelper]

}
