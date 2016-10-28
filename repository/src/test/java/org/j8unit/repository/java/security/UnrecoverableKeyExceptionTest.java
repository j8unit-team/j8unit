package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.UnrecoverableKeyException;
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
public class UnrecoverableKeyExceptionTest
implements FactoryBasedJ8UnitTest<UnrecoverableKeyException>, org.j8unit.repository.java.security.UnrecoverableKeyExceptionTests<UnrecoverableKeyException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.UnrecoverableKeyException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(UnrecoverableKeyException::new);
    }

    @Parameter(0)
    public Callable<UnrecoverableKeyException> sutFactory;

    @Override
    public Callable<UnrecoverableKeyException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.UnrecoverableKeyException]

}
