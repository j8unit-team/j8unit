package org.j8unit.repository.java.util.logging;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.junit.Assume.assumeTrue;
import java.util.concurrent.Callable;
import java.util.logging.MemoryHandler;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MemoryHandlerTest
implements FactoryBasedJ8UnitTest<MemoryHandler>, MemoryHandlerTests<MemoryHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.MemoryHandler]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(MemoryHandler::new);
    }

    @Parameter(0)
    public Callable<MemoryHandler> sutFactory;

    @Override
    public Callable<MemoryHandler> getSUTFactory() {
        assumeTrue("Somebody needs to specify/setup a 'LogManager' at first.", false);
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.MemoryHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.MemoryHandler]

}
