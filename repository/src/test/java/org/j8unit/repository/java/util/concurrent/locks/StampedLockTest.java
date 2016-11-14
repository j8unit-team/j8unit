package org.j8unit.repository.java.util.concurrent.locks;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.StampedLock;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StampedLockTest
implements FactoryBasedJ8UnitTest<StampedLock>, StampedLockTests<StampedLock> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.StampedLock]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(StampedLock::new);
    }

    @Parameter(0)
    public Callable<StampedLock> sutFactory;

    @Override
    public Callable<StampedLock> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.locks.StampedLock]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.locks.StampedLock]

}
