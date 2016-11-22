package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.lang.Thread.State;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.Callable;
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
public class ThreadTest
implements FactoryBasedJ8UnitTest<Thread>, ThreadTests<Thread> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Thread]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Thread::new);
    }

    @Parameter(0)
    public Callable<Thread> sutFactory;

    @Override
    public Callable<Thread> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Thread]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Thread]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link UncaughtExceptionHandler} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.lang.ThreadTests.UncaughtExceptionHandlerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class UncaughtExceptionHandlerTest
    implements UncaughtExceptionHandlerTests<UncaughtExceptionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Thread$UncaughtExceptionHandler]

        @Override
        public UncaughtExceptionHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.Thread.UncaughtExceptionHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Thread$UncaughtExceptionHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Thread$UncaughtExceptionHandler]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link State} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.lang.ThreadTests.StateTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class StateTest
    implements StateTests<State> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Thread$State]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(State.class);
        }

        @Parameter(0)
        public State sut;

        @Override
        public State createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Thread$State]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Thread$State]

    }

}
