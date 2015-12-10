package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SynchronousQueueClassTest
implements org.j8unit.repository.java.util.concurrent.SynchronousQueueClassTests<java.util.concurrent.SynchronousQueue> {

    @Override
    public Class<java.util.concurrent.SynchronousQueue> createNewSUT() {
        return java.util.concurrent.SynchronousQueue.class;
    }

}
