package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.ReadWriteLock;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReadWriteLockClassTest
implements org.j8unit.repository.java.util.concurrent.locks.ReadWriteLockClassTests<ReadWriteLock> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.ReadWriteLock]

    @Override
    public Class<ReadWriteLock> createNewSUT() {
        return ReadWriteLock.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.ReadWriteLock]

}
