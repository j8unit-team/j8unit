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
import org.omg.CORBA.PolicyErrorHolder;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PolicyErrorHolderTest
implements FactoryBasedJ8UnitTest<PolicyErrorHolder>, PolicyErrorHolderTests<PolicyErrorHolder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.PolicyErrorHolder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PolicyErrorHolder::new);
    }

    @Parameter(0)
    public Callable<PolicyErrorHolder> sutFactory;

    @Override
    public Callable<PolicyErrorHolder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.PolicyErrorHolder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.PolicyErrorHolder]

}
