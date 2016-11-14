package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.SignatureException;
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
public class SignatureExceptionTest
implements FactoryBasedJ8UnitTest<SignatureException>, SignatureExceptionTests<SignatureException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.SignatureException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SignatureException::new);
    }

    @Parameter(0)
    public Callable<SignatureException> sutFactory;

    @Override
    public Callable<SignatureException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.SignatureException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.SignatureException]

}
