package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReadWriteLockClassTest
implements org.j8unit.repository.java.util.concurrent.locks.ReadWriteLockClassTests<java.util.concurrent.locks.ReadWriteLock> {

    @Override
    public Class<java.util.concurrent.locks.ReadWriteLock> createNewSUT() {
        return java.util.concurrent.locks.ReadWriteLock.class;
    }

}
