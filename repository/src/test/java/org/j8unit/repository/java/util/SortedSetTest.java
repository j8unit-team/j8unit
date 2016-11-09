package org.j8unit.repository.java.util;

import java.util.SortedSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SortedSet} (by simply reusing the
 * J8Unit test interface {@link SortedSetTests}).
 */

@RunWith(J8Unit4.class)
public class SortedSetTest<E>
implements SortedSetTests<SortedSet<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.SortedSet]

    @Override
    public SortedSet<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.SortedSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.SortedSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.SortedSet]

}
