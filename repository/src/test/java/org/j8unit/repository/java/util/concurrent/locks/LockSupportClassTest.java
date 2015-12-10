package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LockSupportClassTest
implements org.j8unit.repository.java.util.concurrent.locks.LockSupportClassTests<java.util.concurrent.locks.LockSupport> {

    @Override
    public Class<java.util.concurrent.locks.LockSupport> createNewSUT() {
        return java.util.concurrent.locks.LockSupport.class;
    }

}
