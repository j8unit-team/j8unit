package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.KeyManagementException;
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
public class KeyManagementExceptionTest
implements FactoryBasedJ8UnitTest<KeyManagementException>, KeyManagementExceptionTests<KeyManagementException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyManagementException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(KeyManagementException::new);
    }

    @Parameter(0)
    public Callable<KeyManagementException> sutFactory;

    @Override
    public Callable<KeyManagementException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyManagementException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyManagementException]

}
