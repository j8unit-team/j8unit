package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicBooleanTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicBooleanTests<java.util.concurrent.atomic.AtomicBoolean> {

    @Override
    public java.util.concurrent.atomic.AtomicBoolean createNewSUT() {
        return new java.util.concurrent.atomic.AtomicBoolean();
    }

}
