package org.j8unit.repository.java.lang.instrument;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.lang.instrument.IllegalClassFormatException;
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
public class IllegalClassFormatExceptionTest
implements FactoryBasedJ8UnitTest<IllegalClassFormatException>, IllegalClassFormatExceptionTests<IllegalClassFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.instrument.IllegalClassFormatException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(IllegalClassFormatException::new);
    }

    @Parameter(0)
    public Callable<IllegalClassFormatException> sutFactory;

    @Override
    public Callable<IllegalClassFormatException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.instrument.IllegalClassFormatException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.instrument.IllegalClassFormatException]

}
