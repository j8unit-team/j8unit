package org.j8unit.repository.org.omg.CosNaming.NamingContextExtPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CosNaming.NamingContextExtPackage.InvalidAddress;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InvalidAddressTest
implements FactoryBasedJ8UnitTest<InvalidAddress>, InvalidAddressTests<InvalidAddress> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextExtPackage.InvalidAddress]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InvalidAddress::new);
    }

    @Parameter(0)
    public Callable<InvalidAddress> sutFactory;

    @Override
    public Callable<InvalidAddress> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContextExtPackage.InvalidAddress]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContextExtPackage.InvalidAddress]

}
