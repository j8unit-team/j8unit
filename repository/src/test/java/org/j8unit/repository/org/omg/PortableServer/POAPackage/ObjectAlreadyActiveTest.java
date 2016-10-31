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
import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ObjectAlreadyActiveTest
implements FactoryBasedJ8UnitTest<ObjectAlreadyActive>, org.j8unit.repository.org.omg.PortableServer.POAPackage.ObjectAlreadyActiveTests<ObjectAlreadyActive> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAPackage.ObjectAlreadyActive]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ObjectAlreadyActive::new);
    }

    @Parameter(0)
    public Callable<ObjectAlreadyActive> sutFactory;

    @Override
    public Callable<ObjectAlreadyActive> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.POAPackage.ObjectAlreadyActive]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.POAPackage.ObjectAlreadyActive]

}
