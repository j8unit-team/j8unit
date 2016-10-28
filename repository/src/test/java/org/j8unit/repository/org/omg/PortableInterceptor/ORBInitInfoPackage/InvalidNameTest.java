package org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InvalidNameTest
implements FactoryBasedJ8UnitTest<InvalidName>, org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameTests<InvalidName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InvalidName::new);
    }

    @Parameter(0)
    public Callable<InvalidName> sutFactory;

    @Override
    public Callable<InvalidName> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName]

}
