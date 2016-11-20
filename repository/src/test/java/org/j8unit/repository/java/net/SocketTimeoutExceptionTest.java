package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.net.SocketTimeoutException;
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
public class SocketTimeoutExceptionTest
implements FactoryBasedJ8UnitTest<SocketTimeoutException>, SocketTimeoutExceptionTests<SocketTimeoutException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.SocketTimeoutException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SocketTimeoutException::new);
    }

    @Parameter(0)
    public Callable<SocketTimeoutException> sutFactory;

    @Override
    public Callable<SocketTimeoutException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.SocketTimeoutException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.SocketTimeoutException]

}
