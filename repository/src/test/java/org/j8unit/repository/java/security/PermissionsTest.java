package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.Permissions;
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
public class PermissionsTest
implements FactoryBasedJ8UnitTest<Permissions>, org.j8unit.repository.java.security.PermissionsTests<Permissions> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.Permissions]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Permissions::new);
    }

    @Parameter(0)
    public Callable<Permissions> sutFactory;

    @Override
    public Callable<Permissions> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.Permissions]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.Permissions]

}
