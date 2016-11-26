package org.j8unit.repository.java.util.concurrent.locks;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
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
public class ReentrantReadWriteLockTest
implements FactoryBasedJ8UnitTest<ReentrantReadWriteLock>, ReentrantReadWriteLockTests<ReentrantReadWriteLock> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.ReentrantReadWriteLock]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ReentrantReadWriteLock::new);
    }

    @Parameter(0)
    public Callable<ReentrantReadWriteLock> sutFactory;

    @Override
    public Callable<ReentrantReadWriteLock> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.locks.ReentrantReadWriteLock]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.locks.ReentrantReadWriteLock]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ReadLock} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests.ReadLockTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ReadLockTest
    implements ReadLockTests<ReadLock> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock]

        @Override
        public ReadLock createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link WriteLock} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests.WriteLockTests}).
     */
    @RunWith(J8Unit4.class)
    public static class WriteLockTest
    implements WriteLockTests<WriteLock> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock]

        @Override
        public WriteLock createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock]

    }

}
