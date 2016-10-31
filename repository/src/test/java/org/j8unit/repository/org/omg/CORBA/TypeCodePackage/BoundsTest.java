package org.j8unit.repository.org.omg.CORBA.TypeCodePackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.TypeCodePackage.Bounds;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BoundsTest
implements FactoryBasedJ8UnitTest<Bounds>, org.j8unit.repository.org.omg.CORBA.TypeCodePackage.BoundsTests<Bounds> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.TypeCodePackage.Bounds]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Bounds::new);
    }

    @Parameter(0)
    public Callable<Bounds> sutFactory;

    @Override
    public Callable<Bounds> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.TypeCodePackage.Bounds]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.TypeCodePackage.Bounds]

}
