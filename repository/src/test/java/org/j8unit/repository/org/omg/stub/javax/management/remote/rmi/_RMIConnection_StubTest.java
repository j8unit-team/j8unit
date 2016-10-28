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
import org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class _RMIConnection_StubTest
implements FactoryBasedJ8UnitTest<_RMIConnection_Stub>,
org.j8unit.repository.org.omg.stub.javax.management.remote.rmi._RMIConnection_StubTests<_RMIConnection_Stub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(_RMIConnection_Stub::new);
    }

    @Parameter(0)
    public Callable<_RMIConnection_Stub> sutFactory;

    @Override
    public Callable<_RMIConnection_Stub> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub]

}
