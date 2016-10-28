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
import org.omg.CORBA.INVALID_ACTIVITY;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class INVALID_ACTIVITYTest
implements FactoryBasedJ8UnitTest<INVALID_ACTIVITY>, org.j8unit.repository.org.omg.CORBA.INVALID_ACTIVITYTests<INVALID_ACTIVITY> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.INVALID_ACTIVITY]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(INVALID_ACTIVITY::new);
    }

    @Parameter(0)
    public Callable<INVALID_ACTIVITY> sutFactory;

    @Override
    public Callable<INVALID_ACTIVITY> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.INVALID_ACTIVITY]

}
