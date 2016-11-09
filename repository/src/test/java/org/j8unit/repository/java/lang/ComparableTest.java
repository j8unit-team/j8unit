package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Comparable} (by simply reusing the
 * J8Unit test interface {@link ComparableTests}).
 */

@RunWith(J8Unit4.class)
public class ComparableTest<T>
implements ComparableTests<Comparable<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Comparable]

    @Override
    public Comparable<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.Comparable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Comparable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Comparable]

}
