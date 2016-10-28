package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.BlockingQueue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BlockingQueueClassTest
implements org.j8unit.repository.java.util.concurrent.BlockingQueueClassTests<BlockingQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.BlockingQueue]

    @Override
    public Class<BlockingQueue> createNewSUT() {
        return BlockingQueue.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.BlockingQueue]

}
