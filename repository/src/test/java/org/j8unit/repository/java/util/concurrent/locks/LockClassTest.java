package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.Lock;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LockClassTest
implements org.j8unit.repository.java.util.concurrent.locks.LockClassTests<Lock> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.locks.Lock]

    @Override
    public Class<Lock> createNewSUT() {
        return Lock.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.locks.Lock]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.locks.Lock]

}
