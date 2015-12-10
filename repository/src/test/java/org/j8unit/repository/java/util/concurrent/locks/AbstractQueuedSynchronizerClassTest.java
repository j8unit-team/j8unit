package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractQueuedSynchronizerClassTest
implements org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedSynchronizerClassTests<java.util.concurrent.locks.AbstractQueuedSynchronizer> {

    @RunWith(J8Unit4.class)
    public static class ConditionObjectClassTest
    implements
    org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedSynchronizerClassTests.ConditionObjectClassTests<java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject> {

        @Override
        public Class<java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject> createNewSUT() {
            return java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject.class;
        }

    }

    @Override
    public Class<java.util.concurrent.locks.AbstractQueuedSynchronizer> createNewSUT() {
        return java.util.concurrent.locks.AbstractQueuedSynchronizer.class;
    }

}
