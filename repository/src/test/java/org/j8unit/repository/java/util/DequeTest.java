package org.j8unit.repository.java.util;

import java.util.Deque;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Deque} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.DequeTests}).
 */

@RunWith(J8Unit4.class)
public class DequeTest<E>
implements DequeTests<Deque<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Deque]

    @Override
    public Deque<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Deque], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Deque]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Deque]

}
