package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.InvalidParameterException;
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
public class InvalidParameterExceptionTest
implements FactoryBasedJ8UnitTest<InvalidParameterException>, InvalidParameterExceptionTests<InvalidParameterException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.InvalidParameterException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(InvalidParameterException::new);
    }

    @Parameter(0)
    public Callable<InvalidParameterException> sutFactory;

    @Override
    public Callable<InvalidParameterException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.InvalidParameterException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.InvalidParameterException]

}
