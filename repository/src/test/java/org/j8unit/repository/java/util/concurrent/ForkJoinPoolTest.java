package org.j8unit.repository.java.util.concurrent;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;
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
public class ForkJoinPoolTest
implements FactoryBasedJ8UnitTest<ForkJoinPool>, ForkJoinPoolTests<ForkJoinPool> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ForkJoinPool]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ForkJoinPool::new);
    }

    @Parameter(0)
    public Callable<ForkJoinPool> sutFactory;

    @Override
    public Callable<ForkJoinPool> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ForkJoinPool]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ForkJoinPool]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ForkJoinWorkerThreadFactory} (by
     * simply reusing the J8Unit test interface {@link ForkJoinWorkerThreadFactoryTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ForkJoinWorkerThreadFactoryTest
    implements ForkJoinWorkerThreadFactoryTests<ForkJoinWorkerThreadFactory> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory]

        @Override
        public ForkJoinWorkerThreadFactory createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ManagedBlocker} (by simply
     * reusing the J8Unit test interface {@link ManagedBlockerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ManagedBlockerTest
    implements ManagedBlockerTests<ManagedBlocker> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ForkJoinPool$ManagedBlocker]

        @Override
        public ManagedBlocker createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.ForkJoinPool.ManagedBlocker], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ForkJoinPool$ManagedBlocker]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ForkJoinPool$ManagedBlocker]

    }

}
