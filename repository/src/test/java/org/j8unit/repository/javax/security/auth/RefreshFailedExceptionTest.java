package org.j8unit.repository.javax.security.auth;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.security.auth.RefreshFailedException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RefreshFailedExceptionTest
implements FactoryBasedJ8UnitTest<RefreshFailedException>, RefreshFailedExceptionTests<RefreshFailedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.RefreshFailedException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(RefreshFailedException::new);
    }

    @Parameter(0)
    public Callable<RefreshFailedException> sutFactory;

    @Override
    public Callable<RefreshFailedException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.RefreshFailedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.RefreshFailedException]

}
