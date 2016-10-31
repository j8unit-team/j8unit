package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.TransferQueue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransferQueueTest<E>
implements org.j8unit.repository.java.util.concurrent.TransferQueueTests<TransferQueue<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.TransferQueue]

    @Override
    public TransferQueue<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.TransferQueue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.TransferQueue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.TransferQueue]

}
