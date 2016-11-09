package org.j8unit.repository.java.util;

import java.util.Collections;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Collections} (by simply reusing the
 * J8Unit test interface {@link CollectionsTests}).
 */

@RunWith(J8Unit4.class)
public class CollectionsTest
implements CollectionsTests<Collections> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Collections]

    @Override
    public Collections createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Collections], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Collections]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Collections]

}
