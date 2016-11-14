package org.j8unit.repository.java.util;

import java.util.Set;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Set} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.SetTests}).
 */

@RunWith(J8Unit4.class)
public class SetTest<E>
implements SetTests<Set<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Set]

    @Override
    public Set<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Set], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Set]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Set]

}
