package org.j8unit.repository.java.util;

import java.util.Queue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Queue} (by simply reusing the J8Unit
 * test interface {@link QueueTests}).
 */

@RunWith(J8Unit4.class)
public class QueueTest<E>
implements QueueTests<Queue<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Queue]

    @Override
    public Queue<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Queue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Queue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Queue]

}
