package org.j8unit.repository.javax.crypto;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.crypto.ExemptionMechanismException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ExemptionMechanismExceptionTest
implements FactoryBasedJ8UnitTest<ExemptionMechanismException>, ExemptionMechanismExceptionTests<ExemptionMechanismException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.ExemptionMechanismException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ExemptionMechanismException::new);
    }

    @Parameter(0)
    public Callable<ExemptionMechanismException> sutFactory;

    @Override
    public Callable<ExemptionMechanismException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.ExemptionMechanismException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.ExemptionMechanismException]

}
