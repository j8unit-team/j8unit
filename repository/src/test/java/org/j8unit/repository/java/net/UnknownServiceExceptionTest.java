package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.net.UnknownServiceException;
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
public class UnknownServiceExceptionTest
implements FactoryBasedJ8UnitTest<UnknownServiceException>, org.j8unit.repository.java.net.UnknownServiceExceptionTests<UnknownServiceException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.UnknownServiceException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(UnknownServiceException::new);
    }

    @Parameter(0)
    public Callable<UnknownServiceException> sutFactory;

    @Override
    public Callable<UnknownServiceException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.UnknownServiceException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.UnknownServiceException]

}
