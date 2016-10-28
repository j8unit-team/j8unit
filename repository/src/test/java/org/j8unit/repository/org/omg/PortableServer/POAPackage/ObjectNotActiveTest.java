package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableServer.POAPackage.ObjectNotActive;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ObjectNotActiveTest
implements FactoryBasedJ8UnitTest<ObjectNotActive>, org.j8unit.repository.org.omg.PortableServer.POAPackage.ObjectNotActiveTests<ObjectNotActive> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAPackage.ObjectNotActive]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ObjectNotActive::new);
    }

    @Parameter(0)
    public Callable<ObjectNotActive> sutFactory;

    @Override
    public Callable<ObjectNotActive> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAPackage.ObjectNotActive]

}
