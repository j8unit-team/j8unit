package org.j8unit.repository.javax.security.auth;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.security.auth.DestroyFailedException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DestroyFailedExceptionTest
implements FactoryBasedJ8UnitTest<DestroyFailedException>, DestroyFailedExceptionTests<DestroyFailedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.DestroyFailedException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DestroyFailedException::new);
    }

    @Parameter(0)
    public Callable<DestroyFailedException> sutFactory;

    @Override
    public Callable<DestroyFailedException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.DestroyFailedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.DestroyFailedException]

}
