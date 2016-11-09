package org.j8unit.repository.javax.security.sasl;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.security.sasl.SaslException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SaslExceptionTest
implements FactoryBasedJ8UnitTest<SaslException>, SaslExceptionTests<SaslException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.SaslException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SaslException::new);
    }

    @Parameter(0)
    public Callable<SaslException> sutFactory;

    @Override
    public Callable<SaslException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.sasl.SaslException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.sasl.SaslException]

}
