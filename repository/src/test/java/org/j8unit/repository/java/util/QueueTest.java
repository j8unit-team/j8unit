package org.j8unit.repository.java.util;

import java.util.Queue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QueueTest<E>
implements org.j8unit.repository.java.util.QueueTests<Queue<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Queue]

    @Override
    public Queue<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Queue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Queue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Queue]

}
