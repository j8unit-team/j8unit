package org.j8unit.repository.java.rmi.activation;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.rmi.activation.ActivationException;
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
public class ActivationExceptionTest
implements FactoryBasedJ8UnitTest<ActivationException>, ActivationExceptionTests<ActivationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ActivationException::new);
    }

    @Parameter(0)
    public Callable<ActivationException> sutFactory;

    @Override
    public Callable<ActivationException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivationException]

}
