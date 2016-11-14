package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CosNaming.NamingContextPackage.NotEmpty;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NotEmptyTest
implements FactoryBasedJ8UnitTest<NotEmpty>, NotEmptyTests<NotEmpty> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotEmpty]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NotEmpty::new);
    }

    @Parameter(0)
    public Callable<NotEmpty> sutFactory;

    @Override
    public Callable<NotEmpty> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotEmpty]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotEmpty]

}
