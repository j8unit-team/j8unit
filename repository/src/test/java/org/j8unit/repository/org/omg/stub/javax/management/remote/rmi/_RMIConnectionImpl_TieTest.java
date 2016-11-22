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
import org.omg.stub.javax.management.remote.rmi._RMIConnectionImpl_Tie;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class _RMIConnectionImpl_TieTest
implements FactoryBasedJ8UnitTest<_RMIConnectionImpl_Tie>, _RMIConnectionImpl_TieTests<_RMIConnectionImpl_Tie> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIConnectionImpl_Tie]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(_RMIConnectionImpl_Tie::new);
    }

    @Parameter(0)
    public Callable<_RMIConnectionImpl_Tie> sutFactory;

    @Override
    public Callable<_RMIConnectionImpl_Tie> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIConnectionImpl_Tie]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIConnectionImpl_Tie]

}
