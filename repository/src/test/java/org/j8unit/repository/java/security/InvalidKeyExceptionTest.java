package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.InvalidKeyException;
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
public class InvalidKeyExceptionTest
implements FactoryBasedJ8UnitTest<InvalidKeyException>, InvalidKeyExceptionTests<InvalidKeyException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.InvalidKeyException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(InvalidKeyException::new);
    }

    @Parameter(0)
    public Callable<InvalidKeyException> sutFactory;

    @Override
    public Callable<InvalidKeyException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.InvalidKeyException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.InvalidKeyException]

}
