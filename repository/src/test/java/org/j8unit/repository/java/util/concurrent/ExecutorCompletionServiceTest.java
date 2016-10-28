package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ExecutorCompletionService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutorCompletionServiceTest<V>
implements org.j8unit.repository.java.util.concurrent.ExecutorCompletionServiceTests<ExecutorCompletionService<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ExecutorCompletionService]

    @Override
    public ExecutorCompletionService<V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.ExecutorCompletionService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ExecutorCompletionService]

}
