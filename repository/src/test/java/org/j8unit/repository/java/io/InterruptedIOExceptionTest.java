package org.j8unit.repository.java.io;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.io.InterruptedIOException;
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
public class InterruptedIOExceptionTest
implements FactoryBasedJ8UnitTest<InterruptedIOException>, InterruptedIOExceptionTests<InterruptedIOException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.InterruptedIOException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(InterruptedIOException::new);
    }

    @Parameter(0)
    public Callable<InterruptedIOException> sutFactory;

    @Override
    public Callable<InterruptedIOException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.InterruptedIOException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.InterruptedIOException]

}
