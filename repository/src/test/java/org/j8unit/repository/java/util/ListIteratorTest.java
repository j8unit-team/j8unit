package org.j8unit.repository.java.util;

import java.util.ListIterator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ListIterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.ListIteratorTests}).
 */

@RunWith(J8Unit4.class)
public class ListIteratorTest<E>
implements ListIteratorTests<ListIterator<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.ListIterator]

    @Override
    public ListIterator<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.ListIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.ListIterator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.ListIterator]

}
