package org.j8unit.repository.java.security.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.spec.InvalidParameterSpecException;
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
public class InvalidParameterSpecExceptionTest
implements FactoryBasedJ8UnitTest<InvalidParameterSpecException>,
org.j8unit.repository.java.security.spec.InvalidParameterSpecExceptionTests<InvalidParameterSpecException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.InvalidParameterSpecException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InvalidParameterSpecException::new);
    }

    @Parameter(0)
    public Callable<InvalidParameterSpecException> sutFactory;

    @Override
    public Callable<InvalidParameterSpecException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.InvalidParameterSpecException]

}
