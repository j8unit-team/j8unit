package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConcurrentLinkedDequeTest<E>
implements org.j8unit.repository.java.util.concurrent.ConcurrentLinkedDequeTests<java.util.concurrent.ConcurrentLinkedDeque<E>, E> {

    @Override
    public java.util.concurrent.ConcurrentLinkedDeque<E> createNewSUT() {
        return new java.util.concurrent.ConcurrentLinkedDeque<>();
    }

}
