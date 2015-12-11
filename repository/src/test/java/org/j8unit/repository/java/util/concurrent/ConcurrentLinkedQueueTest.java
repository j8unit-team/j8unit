package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConcurrentLinkedQueueTest<E>
implements org.j8unit.repository.java.util.concurrent.ConcurrentLinkedQueueTests<java.util.concurrent.ConcurrentLinkedQueue<E>, E> {

    @Override
    public java.util.concurrent.ConcurrentLinkedQueue<E> createNewSUT() {
        return new java.util.concurrent.ConcurrentLinkedQueue<>();
    }

}
