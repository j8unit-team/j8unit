package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ExecutorCompletionService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ExecutorCompletionService} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ExecutorCompletionServiceTests}).
 */

@RunWith(J8Unit4.class)
public class ExecutorCompletionServiceTest<V>
implements ExecutorCompletionServiceTests<ExecutorCompletionService<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ExecutorCompletionService]

    @Override
    public ExecutorCompletionService<V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.ExecutorCompletionService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ExecutorCompletionService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ExecutorCompletionService]

}
