package org.j8unit.repository.javax.management.remote;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.remote.JMXProviderException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JMXProviderExceptionTest
implements FactoryBasedJ8UnitTest<JMXProviderException>, JMXProviderExceptionTests<JMXProviderException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXProviderException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(JMXProviderException::new);
    }

    @Parameter(0)
    public Callable<JMXProviderException> sutFactory;

    @Override
    public Callable<JMXProviderException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXProviderException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXProviderException]

}
