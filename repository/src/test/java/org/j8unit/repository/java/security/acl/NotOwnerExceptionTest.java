package org.j8unit.repository.java.security.acl;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.acl.NotOwnerException;
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
public class NotOwnerExceptionTest
implements FactoryBasedJ8UnitTest<NotOwnerException>, NotOwnerExceptionTests<NotOwnerException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.NotOwnerException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(NotOwnerException::new);
    }

    @Parameter(0)
    public Callable<NotOwnerException> sutFactory;

    @Override
    public Callable<NotOwnerException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.acl.NotOwnerException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.acl.NotOwnerException]

}
