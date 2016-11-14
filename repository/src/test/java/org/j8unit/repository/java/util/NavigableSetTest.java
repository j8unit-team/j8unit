package org.j8unit.repository.java.util;

import java.util.NavigableSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NavigableSet} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.NavigableSetTests}).
 */

@RunWith(J8Unit4.class)
public class NavigableSetTest<E>
implements NavigableSetTests<NavigableSet<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.NavigableSet]

    @Override
    public NavigableSet<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.NavigableSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.NavigableSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.NavigableSet]

}
