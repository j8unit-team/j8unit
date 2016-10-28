package org.j8unit.repository.java.util.concurrent;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BrokenBarrierExceptionTest
implements FactoryBasedJ8UnitTest<BrokenBarrierException>, org.j8unit.repository.java.util.concurrent.BrokenBarrierExceptionTests<BrokenBarrierException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.BrokenBarrierException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BrokenBarrierException::new);
    }

    @Parameter(0)
    public Callable<BrokenBarrierException> sutFactory;

    @Override
    public Callable<BrokenBarrierException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.BrokenBarrierException]

}
