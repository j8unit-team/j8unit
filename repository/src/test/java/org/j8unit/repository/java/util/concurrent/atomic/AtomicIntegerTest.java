package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicIntegerTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicIntegerTests<java.util.concurrent.atomic.AtomicInteger> {

    @Override
    public java.util.concurrent.atomic.AtomicInteger createNewSUT() {
        return new java.util.concurrent.atomic.AtomicInteger();
    }

}
