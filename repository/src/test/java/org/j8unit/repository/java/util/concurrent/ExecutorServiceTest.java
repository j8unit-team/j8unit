package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ExecutorService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ExecutorService} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ExecutorServiceTests}).
 */
@RunWith(J8Unit4.class)
public class ExecutorServiceTest
implements ExecutorServiceTests<ExecutorService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ExecutorService]

    @Override
    public ExecutorService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.ExecutorService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ExecutorService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ExecutorService]

}
