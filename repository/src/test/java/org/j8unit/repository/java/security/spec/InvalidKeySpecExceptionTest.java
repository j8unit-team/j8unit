package org.j8unit.repository.java.security.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.spec.InvalidKeySpecException;
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
public class InvalidKeySpecExceptionTest
implements FactoryBasedJ8UnitTest<InvalidKeySpecException>, InvalidKeySpecExceptionTests<InvalidKeySpecException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.InvalidKeySpecException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(InvalidKeySpecException::new);
    }

    @Parameter(0)
    public Callable<InvalidKeySpecException> sutFactory;

    @Override
    public Callable<InvalidKeySpecException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.InvalidKeySpecException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.InvalidKeySpecException]

}
