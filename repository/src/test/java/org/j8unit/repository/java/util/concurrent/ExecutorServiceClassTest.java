package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ExecutorService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ExecutorService} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ExecutorServiceClassTests}).
 */
@RunWith(J8Unit4.class)
public class ExecutorServiceClassTest
implements ExecutorServiceClassTests<ExecutorService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ExecutorService]

    @Override
    public Class<ExecutorService> createNewSUT() {
        return ExecutorService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ExecutorService]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ExecutorService]

}
