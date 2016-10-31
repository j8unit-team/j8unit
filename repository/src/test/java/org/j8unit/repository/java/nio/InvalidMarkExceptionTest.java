package org.j8unit.repository.java.nio;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.InvalidMarkException;
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
public class InvalidMarkExceptionTest
implements FactoryBasedJ8UnitTest<InvalidMarkException>, org.j8unit.repository.java.nio.InvalidMarkExceptionTests<InvalidMarkException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.InvalidMarkException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InvalidMarkException::new);
    }

    @Parameter(0)
    public Callable<InvalidMarkException> sutFactory;

    @Override
    public Callable<InvalidMarkException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.InvalidMarkException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.InvalidMarkException]

}
