package org.j8unit.repository.java.nio.channels;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.channels.AlreadyBoundException;
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
public class AlreadyBoundExceptionTest
implements FactoryBasedJ8UnitTest<AlreadyBoundException>, org.j8unit.repository.java.nio.channels.AlreadyBoundExceptionTests<AlreadyBoundException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.AlreadyBoundException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AlreadyBoundException::new);
    }

    @Parameter(0)
    public Callable<AlreadyBoundException> sutFactory;

    @Override
    public Callable<AlreadyBoundException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.AlreadyBoundException]

}
