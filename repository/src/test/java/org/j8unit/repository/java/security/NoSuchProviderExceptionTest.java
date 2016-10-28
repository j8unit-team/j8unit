package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.NoSuchProviderException;
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
public class NoSuchProviderExceptionTest
implements FactoryBasedJ8UnitTest<NoSuchProviderException>, org.j8unit.repository.java.security.NoSuchProviderExceptionTests<NoSuchProviderException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.NoSuchProviderException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NoSuchProviderException::new);
    }

    @Parameter(0)
    public Callable<NoSuchProviderException> sutFactory;

    @Override
    public Callable<NoSuchProviderException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.NoSuchProviderException]

}
