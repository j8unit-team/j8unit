package org.j8unit.repository.java.rmi.server;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.rmi.server.ServerNotActiveException;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ServerNotActiveExceptionTest
implements FactoryBasedJ8UnitTest<ServerNotActiveException>, org.j8unit.repository.java.rmi.server.ServerNotActiveExceptionTests<ServerNotActiveException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.ServerNotActiveException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ServerNotActiveException::new);
    }

    @Parameter(0)
    public Callable<ServerNotActiveException> sutFactory;

    @Override
    public Callable<ServerNotActiveException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.ServerNotActiveException]

}
