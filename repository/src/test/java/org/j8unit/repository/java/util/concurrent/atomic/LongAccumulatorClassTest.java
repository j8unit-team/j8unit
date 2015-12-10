package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongAccumulatorClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.LongAccumulatorClassTests<java.util.concurrent.atomic.LongAccumulator> {

    @Override
    public Class<java.util.concurrent.atomic.LongAccumulator> createNewSUT() {
        return java.util.concurrent.atomic.LongAccumulator.class;
    }

}
