package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynEnum;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DynEnum} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynEnumTests}).
 */

@RunWith(J8Unit4.class)
public class DynEnumTest
implements DynEnumTests<DynEnum> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.DynEnum]

    @Override
    public DynEnum createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.DynamicAny.DynEnum], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.DynEnum]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.DynEnum]

}
