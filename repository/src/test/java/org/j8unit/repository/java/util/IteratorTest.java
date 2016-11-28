package org.j8unit.repository.java.util;

import java.util.Iterator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Iterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.IteratorTests}).
 */
@RunWith(J8Unit4.class)
public class IteratorTest<E>
implements IteratorTests<Iterator<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Iterator]

    @Override
    public Iterator<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Iterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Iterator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Iterator]

}
