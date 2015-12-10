package org.j8unit.repository.java.util.concurrent.locks;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LockSupportTest
implements org.j8unit.repository.java.util.concurrent.locks.LockSupportTests<java.util.concurrent.locks.LockSupport> {

    @Override
    public java.util.concurrent.locks.LockSupport createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.concurrent.locks.LockSupport] available.");
    }

}
