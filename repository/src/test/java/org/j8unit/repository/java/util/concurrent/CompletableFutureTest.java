package org.j8unit.repository.java.util.concurrent;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CompletableFutureTest<T>
implements FactoryBasedJ8UnitTest<CompletableFuture<T>>, CompletableFutureTests<CompletableFuture<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CompletableFuture]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CompletableFuture::new);
    }

    @Parameter(0)
    public Callable<CompletableFuture<T>> sutFactory;

    @Override
    public Callable<CompletableFuture<T>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.CompletableFuture]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.CompletableFuture]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link AsynchronousCompletionTask} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.CompletableFutureTests.AsynchronousCompletionTaskTests}).
     */
    @RunWith(J8Unit4.class)
    public static class AsynchronousCompletionTaskTest
    implements AsynchronousCompletionTaskTests<AsynchronousCompletionTask> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CompletableFuture$AsynchronousCompletionTask]

        @Override
        public AsynchronousCompletionTask createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.CompletableFuture.AsynchronousCompletionTask], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.CompletableFuture$AsynchronousCompletionTask]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.CompletableFuture$AsynchronousCompletionTask]

    }

}
