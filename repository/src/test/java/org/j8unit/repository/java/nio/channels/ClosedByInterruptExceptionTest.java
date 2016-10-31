package org.j8unit.repository.java.nio.channels;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.channels.ClosedByInterruptException;
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
public class ClosedByInterruptExceptionTest
implements FactoryBasedJ8UnitTest<ClosedByInterruptException>,
org.j8unit.repository.java.nio.channels.ClosedByInterruptExceptionTests<ClosedByInterruptException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.ClosedByInterruptException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ClosedByInterruptException::new);
    }

    @Parameter(0)
    public Callable<ClosedByInterruptException> sutFactory;

    @Override
    public Callable<ClosedByInterruptException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.ClosedByInterruptException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.ClosedByInterruptException]

}
