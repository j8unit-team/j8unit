package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongAdderTest
implements org.j8unit.repository.java.util.concurrent.atomic.LongAdderTests<java.util.concurrent.atomic.LongAdder> {

    @Override
    public java.util.concurrent.atomic.LongAdder createNewSUT() {
        return new java.util.concurrent.atomic.LongAdder();
    }

}
