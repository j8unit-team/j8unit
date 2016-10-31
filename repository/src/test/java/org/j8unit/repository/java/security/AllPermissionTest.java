package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.AllPermission;
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
public class AllPermissionTest
implements FactoryBasedJ8UnitTest<AllPermission>, org.j8unit.repository.java.security.AllPermissionTests<AllPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.AllPermission]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AllPermission::new);
    }

    @Parameter(0)
    public Callable<AllPermission> sutFactory;

    @Override
    public Callable<AllPermission> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.AllPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.AllPermission]

}
