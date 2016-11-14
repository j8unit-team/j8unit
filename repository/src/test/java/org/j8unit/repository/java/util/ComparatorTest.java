package org.j8unit.repository.java.util;

import java.util.Comparator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Comparator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.ComparatorTests}).
 */

@RunWith(J8Unit4.class)
public class ComparatorTest<T>
implements ComparatorTests<Comparator<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Comparator]

    @Override
    public Comparator<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Comparator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Comparator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Comparator]

}
