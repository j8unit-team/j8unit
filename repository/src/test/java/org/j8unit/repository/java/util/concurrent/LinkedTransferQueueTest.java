package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkedTransferQueueTest<E>
implements org.j8unit.repository.java.util.concurrent.LinkedTransferQueueTests<java.util.concurrent.LinkedTransferQueue<E>, E> {

    @Override
    public java.util.concurrent.LinkedTransferQueue<E> createNewSUT() {
        return new java.util.concurrent.LinkedTransferQueue();
    }

}
