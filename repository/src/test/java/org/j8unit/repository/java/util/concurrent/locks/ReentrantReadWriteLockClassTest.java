package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReentrantReadWriteLockClassTest
implements org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests<java.util.concurrent.locks.ReentrantReadWriteLock> {

    @RunWith(J8Unit4.class)
    public static class ReadLockClassTest
    implements
    org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests.ReadLockClassTests<java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock> {

        @Override
        public Class<java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock> createNewSUT() {
            return java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class WriteLockClassTest
    implements
    org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockClassTests.WriteLockClassTests<java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock> {

        @Override
        public Class<java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock> createNewSUT() {
            return java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock.class;
        }

    }

    @Override
    public Class<java.util.concurrent.locks.ReentrantReadWriteLock> createNewSUT() {
        return java.util.concurrent.locks.ReentrantReadWriteLock.class;
    }

}
