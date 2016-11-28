package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.BlockingQueue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BlockingQueue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.BlockingQueueTests}).
 */
@RunWith(J8Unit4.class)
public class BlockingQueueTest<E>
implements BlockingQueueTests<BlockingQueue<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.BlockingQueue]

    @Override
    public BlockingQueue<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.BlockingQueue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.BlockingQueue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.BlockingQueue]

}
