package org.j8unit.repository.java.util.logging;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.junit.Assume.assumeTrue;
import java.util.concurrent.Callable;
import java.util.logging.SocketHandler;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SocketHandlerTest
implements FactoryBasedJ8UnitTest<SocketHandler>, SocketHandlerTests<SocketHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.SocketHandler]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SocketHandler::new);
    }

    @Parameter(0)
    public Callable<SocketHandler> sutFactory;

    @Override
    public Callable<SocketHandler> getSUTFactory() {
        assumeTrue("Somebody needs to specify/setup a 'LogManager' at first.", false);
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.SocketHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.SocketHandler]

}
