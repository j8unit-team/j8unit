package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongAdderClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.LongAdderClassTests<java.util.concurrent.atomic.LongAdder> {

    @Override
    public Class<java.util.concurrent.atomic.LongAdder> createNewSUT() {
        return java.util.concurrent.atomic.LongAdder.class;
    }

}
