package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ArrayBlockingQueueClassTest
implements org.j8unit.repository.java.util.concurrent.ArrayBlockingQueueClassTests<java.util.concurrent.ArrayBlockingQueue> {

    @Override
    public Class<java.util.concurrent.ArrayBlockingQueue> createNewSUT() {
        return java.util.concurrent.ArrayBlockingQueue.class;
    }

}
