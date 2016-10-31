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
import org.omg.CORBA.INTF_REPOS;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class INTF_REPOSTest
implements FactoryBasedJ8UnitTest<INTF_REPOS>, org.j8unit.repository.org.omg.CORBA.INTF_REPOSTests<INTF_REPOS> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.INTF_REPOS]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(INTF_REPOS::new);
    }

    @Parameter(0)
    public Callable<INTF_REPOS> sutFactory;

    @Override
    public Callable<INTF_REPOS> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.INTF_REPOS]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.INTF_REPOS]

}
