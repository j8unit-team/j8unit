package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LockClassTest
implements org.j8unit.repository.java.util.concurrent.locks.LockClassTests<java.util.concurrent.locks.Lock> {

    @Override
    public Class<java.util.concurrent.locks.Lock> createNewSUT() {
        return java.util.concurrent.locks.Lock.class;
    }

}
