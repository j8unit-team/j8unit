package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.BlockingQueue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BlockingQueue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.BlockingQueueClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BlockingQueueClassTest
implements BlockingQueueClassTests<BlockingQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.BlockingQueue]

    @Override
    public Class<BlockingQueue> createNewSUT() {
        return BlockingQueue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.BlockingQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.BlockingQueue]

}
