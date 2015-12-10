package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayBlockingQueueTest<E>
implements org.j8unit.repository.java.util.concurrent.ArrayBlockingQueueTests<java.util.concurrent.ArrayBlockingQueue<E>, E> {

    @Override
    public java.util.concurrent.ArrayBlockingQueue<E> createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.util.concurrent.ArrayBlockingQueue] available.");
    }

}
