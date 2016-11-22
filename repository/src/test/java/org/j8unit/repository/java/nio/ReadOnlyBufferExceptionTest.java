package org.j8unit.repository.java.nio;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.ReadOnlyBufferException;
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
public class ReadOnlyBufferExceptionTest
implements FactoryBasedJ8UnitTest<ReadOnlyBufferException>, ReadOnlyBufferExceptionTests<ReadOnlyBufferException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.ReadOnlyBufferException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ReadOnlyBufferException::new);
    }

    @Parameter(0)
    public Callable<ReadOnlyBufferException> sutFactory;

    @Override
    public Callable<ReadOnlyBufferException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.ReadOnlyBufferException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.ReadOnlyBufferException]

}
