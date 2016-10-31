package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.AbstractExecutorService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractExecutorServiceTest
implements org.j8unit.repository.java.util.concurrent.AbstractExecutorServiceTests<AbstractExecutorService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.AbstractExecutorService]

    @Override
    public AbstractExecutorService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.AbstractExecutorService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.AbstractExecutorService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.AbstractExecutorService]

}
