package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SynchronousQueueTest<E>
implements org.j8unit.repository.java.util.concurrent.SynchronousQueueTests<java.util.concurrent.SynchronousQueue<E>, E> {

    @Override
    public java.util.concurrent.SynchronousQueue<E> createNewSUT() {
        return new java.util.concurrent.SynchronousQueue();
    }

}
