package org.j8unit.repository.java.security.acl;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.acl.AclNotFoundException;
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
public class AclNotFoundExceptionTest
implements FactoryBasedJ8UnitTest<AclNotFoundException>, org.j8unit.repository.java.security.acl.AclNotFoundExceptionTests<AclNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.AclNotFoundException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AclNotFoundException::new);
    }

    @Parameter(0)
    public Callable<AclNotFoundException> sutFactory;

    @Override
    public Callable<AclNotFoundException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.AclNotFoundException]

}
