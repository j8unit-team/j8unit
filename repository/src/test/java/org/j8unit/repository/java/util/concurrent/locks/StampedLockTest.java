package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StampedLockTest
implements org.j8unit.repository.java.util.concurrent.locks.StampedLockTests<java.util.concurrent.locks.StampedLock> {

    @Override
    public java.util.concurrent.locks.StampedLock createNewSUT() {
        return new java.util.concurrent.locks.StampedLock();
    }

}
