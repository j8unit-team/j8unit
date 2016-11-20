package org.j8unit.repository.org.omg.PortableServer.CurrentPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableServer.CurrentPackage.NoContext;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NoContextTest
implements FactoryBasedJ8UnitTest<NoContext>, NoContextTests<NoContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.CurrentPackage.NoContext]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(NoContext::new);
    }

    @Parameter(0)
    public Callable<NoContext> sutFactory;

    @Override
    public Callable<NoContext> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.CurrentPackage.NoContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.CurrentPackage.NoContext]

}
