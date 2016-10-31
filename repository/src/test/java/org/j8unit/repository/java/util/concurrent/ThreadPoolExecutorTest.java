package org.j8unit.repository.java.util.concurrent;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class ThreadPoolExecutorTest
implements org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests<ThreadPoolExecutor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor]

    @Override
    public ThreadPoolExecutor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.ThreadPoolExecutor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DiscardPolicyTest
    implements FactoryBasedJ8UnitTest<DiscardPolicy>, org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.DiscardPolicyTests<DiscardPolicy> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$DiscardPolicy]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(DiscardPolicy::new);
        }

        @Parameter(0)
        public Callable<DiscardPolicy> sutFactory;

        @Override
        public Callable<DiscardPolicy> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$DiscardPolicy]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$DiscardPolicy]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class AbortPolicyTest
    implements FactoryBasedJ8UnitTest<AbortPolicy>, org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.AbortPolicyTests<AbortPolicy> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$AbortPolicy]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(AbortPolicy::new);
        }

        @Parameter(0)
        public Callable<AbortPolicy> sutFactory;

        @Override
        public Callable<AbortPolicy> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$AbortPolicy]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$AbortPolicy]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class CallerRunsPolicyTest
    implements FactoryBasedJ8UnitTest<CallerRunsPolicy>,
    org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.CallerRunsPolicyTests<CallerRunsPolicy> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(CallerRunsPolicy::new);
        }

        @Parameter(0)
        public Callable<CallerRunsPolicy> sutFactory;

        @Override
        public Callable<CallerRunsPolicy> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DiscardOldestPolicyTest
    implements FactoryBasedJ8UnitTest<DiscardOldestPolicy>,
    org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.DiscardOldestPolicyTests<DiscardOldestPolicy> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(DiscardOldestPolicy::new);
        }

        @Parameter(0)
        public Callable<DiscardOldestPolicy> sutFactory;

        @Override
        public Callable<DiscardOldestPolicy> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy]

    }

}
