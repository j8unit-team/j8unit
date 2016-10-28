package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayBlockingQueueTest<E>
implements org.j8unit.repository.java.util.concurrent.ArrayBlockingQueueTests<ArrayBlockingQueue<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ArrayBlockingQueue]

    @Override
    public ArrayBlockingQueue<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.ArrayBlockingQueue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ArrayBlockingQueue]

}
