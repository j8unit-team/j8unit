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
import org.omg.CORBA.BAD_INV_ORDER;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BAD_INV_ORDERTest
implements FactoryBasedJ8UnitTest<BAD_INV_ORDER>, org.j8unit.repository.org.omg.CORBA.BAD_INV_ORDERTests<BAD_INV_ORDER> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.BAD_INV_ORDER]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BAD_INV_ORDER::new);
    }

    @Parameter(0)
    public Callable<BAD_INV_ORDER> sutFactory;

    @Override
    public Callable<BAD_INV_ORDER> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.BAD_INV_ORDER]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.BAD_INV_ORDER]

}
