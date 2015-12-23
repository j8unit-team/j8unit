package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PriorityBlockingQueueTest<E>
implements org.j8unit.repository.java.util.concurrent.PriorityBlockingQueueTests<java.util.concurrent.PriorityBlockingQueue<E>, E> {

    @Override
    public java.util.concurrent.PriorityBlockingQueue<E> createNewSUT() {
        return new java.util.concurrent.PriorityBlockingQueue();
    }

}
