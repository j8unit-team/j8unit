package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReentrantReadWriteLockTest
implements org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests<java.util.concurrent.locks.ReentrantReadWriteLock> {

    @RunWith(J8Unit4.class)
    public static class ReadLockTest
    implements
    org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests.ReadLockTests<java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock> {

        @Override
        public java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class WriteLockTest
    implements
    org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests.WriteLockTests<java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock> {

        @Override
        public java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock] available.");
        }

    }

    @Override
    public java.util.concurrent.locks.ReentrantReadWriteLock createNewSUT() {
        return new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

}
