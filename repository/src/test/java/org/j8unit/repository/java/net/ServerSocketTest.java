package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.net.ServerSocket;
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
public class ServerSocketTest
implements FactoryBasedJ8UnitTest<ServerSocket>, org.j8unit.repository.java.net.ServerSocketTests<ServerSocket> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.ServerSocket]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ServerSocket::new);
    }

    @Parameter(0)
    public Callable<ServerSocket> sutFactory;

    @Override
    public Callable<ServerSocket> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.ServerSocket]

}
