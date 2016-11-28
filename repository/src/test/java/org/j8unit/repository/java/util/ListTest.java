package org.j8unit.repository.java.util;

import java.util.List;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link List} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.ListTests}).
 */
@RunWith(J8Unit4.class)
public class ListTest<E>
implements ListTests<List<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.List]

    @Override
    public List<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.List], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.List]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.List]

}
