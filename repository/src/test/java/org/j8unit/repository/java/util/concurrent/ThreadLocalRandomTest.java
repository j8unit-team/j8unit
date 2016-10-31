package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ThreadLocalRandom;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadLocalRandomTest
implements org.j8unit.repository.java.util.concurrent.ThreadLocalRandomTests<ThreadLocalRandom> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ThreadLocalRandom]

    @Override
    public ThreadLocalRandom createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.ThreadLocalRandom], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ThreadLocalRandom]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ThreadLocalRandom]

}
