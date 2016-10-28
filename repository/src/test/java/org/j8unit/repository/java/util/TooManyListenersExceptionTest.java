package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.TooManyListenersException;
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
public class TooManyListenersExceptionTest
implements FactoryBasedJ8UnitTest<TooManyListenersException>, org.j8unit.repository.java.util.TooManyListenersExceptionTests<TooManyListenersException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.TooManyListenersException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TooManyListenersException::new);
    }

    @Parameter(0)
    public Callable<TooManyListenersException> sutFactory;

    @Override
    public Callable<TooManyListenersException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.TooManyListenersException]

}
