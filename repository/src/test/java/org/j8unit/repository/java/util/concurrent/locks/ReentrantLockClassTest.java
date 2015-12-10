package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReentrantLockClassTest
implements org.j8unit.repository.java.util.concurrent.locks.ReentrantLockClassTests<java.util.concurrent.locks.ReentrantLock> {

    @Override
    public Class<java.util.concurrent.locks.ReentrantLock> createNewSUT() {
        return java.util.concurrent.locks.ReentrantLock.class;
    }

}
