package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynFixed;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DynFixed} (by simply reusing the
 * J8Unit test interface {@link DynFixedTests}).
 */

@RunWith(J8Unit4.class)
public class DynFixedTest
implements DynFixedTests<DynFixed> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.DynFixed]

    @Override
    public DynFixed createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.DynamicAny.DynFixed], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.DynFixed]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.DynFixed]

}
