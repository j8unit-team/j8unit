package org.j8unit.repository.java.util;

import java.util.RandomAccess;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RandomAccess} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.RandomAccessTests}).
 */
@RunWith(J8Unit4.class)
public class RandomAccessTest
implements RandomAccessTests<RandomAccess> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.RandomAccess]

    @Override
    public RandomAccess createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.RandomAccess], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.RandomAccess]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.RandomAccess]

}
