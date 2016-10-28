package org.j8unit.repository.org.omg.PortableServer.ServantLocatorPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableServer.ServantLocatorPackage.CookieHolder;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CookieHolderTest
implements FactoryBasedJ8UnitTest<CookieHolder>, org.j8unit.repository.org.omg.PortableServer.ServantLocatorPackage.CookieHolderTests<CookieHolder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantLocatorPackage.CookieHolder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CookieHolder::new);
    }

    @Parameter(0)
    public Callable<CookieHolder> sutFactory;

    @Override
    public Callable<CookieHolder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantLocatorPackage.CookieHolder]

}
