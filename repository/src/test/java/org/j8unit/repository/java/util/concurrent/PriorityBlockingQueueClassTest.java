package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class PriorityBlockingQueueClassTest
implements org.j8unit.repository.java.util.concurrent.PriorityBlockingQueueClassTests<java.util.concurrent.PriorityBlockingQueue> {

    @Override
    public Class<java.util.concurrent.PriorityBlockingQueue> createNewSUT() {
        return java.util.concurrent.PriorityBlockingQueue.class;
    }

}
