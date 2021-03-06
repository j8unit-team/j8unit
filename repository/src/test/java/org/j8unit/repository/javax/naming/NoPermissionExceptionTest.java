package org.j8unit.repository.javax.naming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.NoPermissionException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NoPermissionExceptionTest
implements FactoryBasedJ8UnitTest<NoPermissionException>, NoPermissionExceptionTests<NoPermissionException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.NoPermissionException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(NoPermissionException::new);
    }

    @Parameter(0)
    public Callable<NoPermissionException> sutFactory;

    @Override
    public Callable<NoPermissionException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.NoPermissionException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.NoPermissionException]

}
