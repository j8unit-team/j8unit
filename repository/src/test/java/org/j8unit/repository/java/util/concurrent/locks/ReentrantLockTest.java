package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReentrantLockTest
implements org.j8unit.repository.java.util.concurrent.locks.ReentrantLockTests<java.util.concurrent.locks.ReentrantLock> {

    @Override
    public java.util.concurrent.locks.ReentrantLock createNewSUT() {
        return new java.util.concurrent.locks.ReentrantLock();
    }

}
