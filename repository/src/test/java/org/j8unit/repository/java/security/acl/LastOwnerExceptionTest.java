package org.j8unit.repository.java.security.acl;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.acl.LastOwnerException;
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
public class LastOwnerExceptionTest
implements FactoryBasedJ8UnitTest<LastOwnerException>, org.j8unit.repository.java.security.acl.LastOwnerExceptionTests<LastOwnerException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.LastOwnerException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(LastOwnerException::new);
    }

    @Parameter(0)
    public Callable<LastOwnerException> sutFactory;

    @Override
    public Callable<LastOwnerException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.acl.LastOwnerException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.acl.LastOwnerException]

}
