package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PriorityQueueTest<E>
implements org.j8unit.repository.java.util.PriorityQueueTests<java.util.PriorityQueue<E>, E> {

    @Override
    public java.util.PriorityQueue<E> createNewSUT() {
        return new java.util.PriorityQueue<>();
    }

}
