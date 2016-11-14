package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
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
public class IllegalAccessExceptionTest
implements FactoryBasedJ8UnitTest<IllegalAccessException>, IllegalAccessExceptionTests<IllegalAccessException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.IllegalAccessException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(IllegalAccessException::new);
    }

    @Parameter(0)
    public Callable<IllegalAccessException> sutFactory;

    @Override
    public Callable<IllegalAccessException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.IllegalAccessException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.IllegalAccessException]

}