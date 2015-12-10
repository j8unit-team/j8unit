package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class BlockingQueueClassTest
implements org.j8unit.repository.java.util.concurrent.BlockingQueueClassTests<java.util.concurrent.BlockingQueue> {

    @Override
    public Class<java.util.concurrent.BlockingQueue> createNewSUT() {
        return java.util.concurrent.BlockingQueue.class;
    }

}
