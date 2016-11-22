package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.FormatterClosedException;
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
public class FormatterClosedExceptionTest
implements FactoryBasedJ8UnitTest<FormatterClosedException>, FormatterClosedExceptionTests<FormatterClosedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.FormatterClosedException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(FormatterClosedException::new);
    }

    @Parameter(0)
    public Callable<FormatterClosedException> sutFactory;

    @Override
    public Callable<FormatterClosedException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.FormatterClosedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.FormatterClosedException]

}
