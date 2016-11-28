package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.DynamicImplementation;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
@SuppressWarnings("deprecation")
public class DynamicImplementationTest
implements FactoryBasedJ8UnitTest<DynamicImplementation>, DynamicImplementationTests<DynamicImplementation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.DynamicImplementation]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DynamicImplementation::new);
    }

    @Parameter(0)
    public Callable<DynamicImplementation> sutFactory;

    @Override
    public Callable<DynamicImplementation> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.DynamicImplementation]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.DynamicImplementation]

}
