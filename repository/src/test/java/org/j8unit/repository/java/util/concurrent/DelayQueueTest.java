package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DelayQueueTest<E extends java.util.concurrent.Delayed>
implements org.j8unit.repository.java.util.concurrent.DelayQueueTests<java.util.concurrent.DelayQueue<E>, E> {

    @Override
    public java.util.concurrent.DelayQueue<E> createNewSUT() {
        return new java.util.concurrent.DelayQueue<>();
    }

}
