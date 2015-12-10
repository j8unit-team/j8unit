package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicLongClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicLongClassTests<java.util.concurrent.atomic.AtomicLong> {

    @Override
    public Class<java.util.concurrent.atomic.AtomicLong> createNewSUT() {
        return java.util.concurrent.atomic.AtomicLong.class;
    }

}
