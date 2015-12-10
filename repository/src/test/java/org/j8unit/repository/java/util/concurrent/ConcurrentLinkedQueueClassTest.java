package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ConcurrentLinkedQueueClassTest
implements org.j8unit.repository.java.util.concurrent.ConcurrentLinkedQueueClassTests<java.util.concurrent.ConcurrentLinkedQueue> {

    @Override
    public Class<java.util.concurrent.ConcurrentLinkedQueue> createNewSUT() {
        return java.util.concurrent.ConcurrentLinkedQueue.class;
    }

}
