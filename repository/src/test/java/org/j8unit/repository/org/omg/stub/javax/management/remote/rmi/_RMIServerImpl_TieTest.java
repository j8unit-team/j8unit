package org.j8unit.repository.org.omg.stub.javax.management.remote.rmi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class _RMIServerImpl_TieTest
implements FactoryBasedJ8UnitTest<_RMIServerImpl_Tie>, _RMIServerImpl_TieTests<_RMIServerImpl_Tie> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(_RMIServerImpl_Tie::new);
    }

    @Parameter(0)
    public Callable<_RMIServerImpl_Tie> sutFactory;

    @Override
    public Callable<_RMIServerImpl_Tie> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIServerImpl_Tie]

}
