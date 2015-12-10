package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicLongTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicLongTests<java.util.concurrent.atomic.AtomicLong> {

    @Override
    public java.util.concurrent.atomic.AtomicLong createNewSUT() {
        return new java.util.concurrent.atomic.AtomicLong();
    }

}
