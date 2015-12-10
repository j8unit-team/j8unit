package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicIntegerClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicIntegerClassTests<java.util.concurrent.atomic.AtomicInteger> {

    @Override
    public Class<java.util.concurrent.atomic.AtomicInteger> createNewSUT() {
        return java.util.concurrent.atomic.AtomicInteger.class;
    }

}
