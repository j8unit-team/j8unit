package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Executor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Executor} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.concurrent.ExecutorClassTests}).
 */
@RunWith(J8Unit4.class)
public class ExecutorClassTest
implements ExecutorClassTests<Executor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Executor]

    @Override
    public Class<Executor> createNewSUT() {
        return Executor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.Executor]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Executor]

}
