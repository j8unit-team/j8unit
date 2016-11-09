package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.BlockingDeque;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BlockingDeque} (by simply reusing the
 * J8Unit test interface {@link BlockingDequeTests}).
 */

@RunWith(J8Unit4.class)
public class BlockingDequeTest<E>
implements BlockingDequeTests<BlockingDeque<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.BlockingDeque]

    @Override
    public BlockingDeque<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.BlockingDeque], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.BlockingDeque]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.BlockingDeque]

}
