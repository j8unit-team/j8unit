package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class DelayQueueClassTest
implements org.j8unit.repository.java.util.concurrent.DelayQueueClassTests<java.util.concurrent.DelayQueue> {

    @Override
    public Class<java.util.concurrent.DelayQueue> createNewSUT() {
        return java.util.concurrent.DelayQueue.class;
    }

}
