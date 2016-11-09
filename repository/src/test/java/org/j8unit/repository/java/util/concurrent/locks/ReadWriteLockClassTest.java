package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.ReadWriteLock;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ReadWriteLock} (by simply reusing the
 * J8Unit test interface {@link ReadWriteLockClassTests}).
 */

@RunWith(J8Unit4.class)
public class ReadWriteLockClassTest
implements ReadWriteLockClassTests<ReadWriteLock> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.ReadWriteLock]

    @Override
    public Class<ReadWriteLock> createNewSUT() {
        return ReadWriteLock.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.locks.ReadWriteLock]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.ReadWriteLock]

}
