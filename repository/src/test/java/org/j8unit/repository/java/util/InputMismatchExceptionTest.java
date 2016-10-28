package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.InputMismatchException;
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
public class InputMismatchExceptionTest
implements FactoryBasedJ8UnitTest<InputMismatchException>, org.j8unit.repository.java.util.InputMismatchExceptionTests<InputMismatchException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.InputMismatchException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InputMismatchException::new);
    }

    @Parameter(0)
    public Callable<InputMismatchException> sutFactory;

    @Override
    public Callable<InputMismatchException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.InputMismatchException]

}
