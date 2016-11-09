package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ExecutorCompletionService;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ExecutorCompletionService} (by simply
 * reusing the J8Unit test interface {@link ExecutorCompletionServiceClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ExecutorCompletionServiceClassTest
implements ExecutorCompletionServiceClassTests<ExecutorCompletionService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ExecutorCompletionService]

    @Override
    public Class<ExecutorCompletionService> createNewSUT() {
        return ExecutorCompletionService.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ExecutorCompletionService#ExecutorCompletionService(java.util.concurrent.Executor, java.util.concurrent.BlockingQueue)
     * public
     * java.util.concurrent.ExecutorCompletionService(java.util.concurrent.Executor,java.util.concurrent.BlockingQueue<java.util.concurrent.Future<V>>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ExecutorCompletionService_Executor_BlockingQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ExecutorCompletionService sut = null; // = new ExecutorCompletionService(java.util.concurrent.Executor,
                                                    // java.util.concurrent.BlockingQueue);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ExecutorCompletionService#ExecutorCompletionService(java.util.concurrent.Executor)
     * public java.util.concurrent.ExecutorCompletionService(java.util.concurrent.Executor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ExecutorCompletionService_Executor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ExecutorCompletionService sut = null; // = new ExecutorCompletionService(java.util.concurrent.Executor);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ExecutorCompletionService]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ExecutorCompletionService]

}
