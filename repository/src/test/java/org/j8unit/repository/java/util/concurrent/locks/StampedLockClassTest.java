package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StampedLockClassTest
implements org.j8unit.repository.java.util.concurrent.locks.StampedLockClassTests<java.util.concurrent.locks.StampedLock> {

    @Override
    public Class<java.util.concurrent.locks.StampedLock> createNewSUT() {
        return java.util.concurrent.locks.StampedLock.class;
    }

}
