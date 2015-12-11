package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkedBlockingQueueTest<E>
implements org.j8unit.repository.java.util.concurrent.LinkedBlockingQueueTests<java.util.concurrent.LinkedBlockingQueue<E>, E> {

    @Override
    public java.util.concurrent.LinkedBlockingQueue<E> createNewSUT() {
        return new java.util.concurrent.LinkedBlockingQueue<>();
    }

}
