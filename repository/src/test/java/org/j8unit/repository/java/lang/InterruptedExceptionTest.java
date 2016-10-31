package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
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
public class InterruptedExceptionTest
implements FactoryBasedJ8UnitTest<InterruptedException>, org.j8unit.repository.java.lang.InterruptedExceptionTests<InterruptedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.InterruptedException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InterruptedException::new);
    }

    @Parameter(0)
    public Callable<InterruptedException> sutFactory;

    @Override
    public Callable<InterruptedException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.InterruptedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.InterruptedException]

}
