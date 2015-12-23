package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractQueuedLongSynchronizerClassTest
implements
org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedLongSynchronizerClassTests<java.util.concurrent.locks.AbstractQueuedLongSynchronizer> {

    @Override
    public Class<java.util.concurrent.locks.AbstractQueuedLongSynchronizer> createNewSUT() {
        return java.util.concurrent.locks.AbstractQueuedLongSynchronizer.class;
    }

    @RunWith(J8Unit4.class)
    public static class ConditionObjectClassTest
    implements
    org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedLongSynchronizerClassTests.ConditionObjectClassTests<java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject> {

        @Override
        public Class<java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject> createNewSUT() {
            return java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject.class;
        }

    }

}
