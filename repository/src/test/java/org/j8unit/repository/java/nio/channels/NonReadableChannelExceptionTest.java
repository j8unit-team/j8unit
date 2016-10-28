package org.j8unit.repository.java.nio.channels;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.channels.NonReadableChannelException;
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
public class NonReadableChannelExceptionTest
implements FactoryBasedJ8UnitTest<NonReadableChannelException>,
org.j8unit.repository.java.nio.channels.NonReadableChannelExceptionTests<NonReadableChannelException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.NonReadableChannelException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NonReadableChannelException::new);
    }

    @Parameter(0)
    public Callable<NonReadableChannelException> sutFactory;

    @Override
    public Callable<NonReadableChannelException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.NonReadableChannelException]

}
