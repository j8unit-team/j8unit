package org.j8unit.repository.java.nio.channels;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.channels.IllegalBlockingModeException;
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
public class IllegalBlockingModeExceptionTest
implements FactoryBasedJ8UnitTest<IllegalBlockingModeException>,
org.j8unit.repository.java.nio.channels.IllegalBlockingModeExceptionTests<IllegalBlockingModeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.IllegalBlockingModeException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(IllegalBlockingModeException::new);
    }

    @Parameter(0)
    public Callable<IllegalBlockingModeException> sutFactory;

    @Override
    public Callable<IllegalBlockingModeException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.IllegalBlockingModeException]

}
