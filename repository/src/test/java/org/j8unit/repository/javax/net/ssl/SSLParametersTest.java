package org.j8unit.repository.javax.net.ssl;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLParameters;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SSLParametersTest
implements FactoryBasedJ8UnitTest<SSLParameters>, org.j8unit.repository.javax.net.ssl.SSLParametersTests<SSLParameters> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLParameters]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SSLParameters::new);
    }

    @Parameter(0)
    public Callable<SSLParameters> sutFactory;

    @Override
    public Callable<SSLParameters> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SSLParameters]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SSLParameters]

}
