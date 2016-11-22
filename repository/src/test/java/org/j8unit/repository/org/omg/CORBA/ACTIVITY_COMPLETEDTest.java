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
import org.omg.CORBA.ACTIVITY_COMPLETED;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ACTIVITY_COMPLETEDTest
implements FactoryBasedJ8UnitTest<ACTIVITY_COMPLETED>, ACTIVITY_COMPLETEDTests<ACTIVITY_COMPLETED> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ACTIVITY_COMPLETED]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ACTIVITY_COMPLETED::new);
    }

    @Parameter(0)
    public Callable<ACTIVITY_COMPLETED> sutFactory;

    @Override
    public Callable<ACTIVITY_COMPLETED> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.ACTIVITY_COMPLETED]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.ACTIVITY_COMPLETED]

}
