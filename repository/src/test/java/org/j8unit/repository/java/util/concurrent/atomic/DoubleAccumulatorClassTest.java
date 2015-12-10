package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleAccumulatorClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.DoubleAccumulatorClassTests<java.util.concurrent.atomic.DoubleAccumulator> {

    @Override
    public Class<java.util.concurrent.atomic.DoubleAccumulator> createNewSUT() {
        return java.util.concurrent.atomic.DoubleAccumulator.class;
    }

}
