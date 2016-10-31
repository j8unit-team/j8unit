package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CountDownLatch;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CountDownLatchTest
implements org.j8unit.repository.java.util.concurrent.CountDownLatchTests<CountDownLatch> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CountDownLatch]

    @Override
    public CountDownLatch createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.CountDownLatch], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.CountDownLatch]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.CountDownLatch]

}
