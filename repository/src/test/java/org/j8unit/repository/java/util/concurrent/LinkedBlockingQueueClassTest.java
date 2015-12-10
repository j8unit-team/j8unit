package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class LinkedBlockingQueueClassTest
implements org.j8unit.repository.java.util.concurrent.LinkedBlockingQueueClassTests<java.util.concurrent.LinkedBlockingQueue> {

    @Override
    public Class<java.util.concurrent.LinkedBlockingQueue> createNewSUT() {
        return java.util.concurrent.LinkedBlockingQueue.class;
    }

}
