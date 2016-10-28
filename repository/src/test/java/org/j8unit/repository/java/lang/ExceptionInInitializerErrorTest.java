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
public class ExceptionInInitializerErrorTest
implements FactoryBasedJ8UnitTest<ExceptionInInitializerError>, org.j8unit.repository.java.lang.ExceptionInInitializerErrorTests<ExceptionInInitializerError> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ExceptionInInitializerError]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ExceptionInInitializerError::new);
    }

    @Parameter(0)
    public Callable<ExceptionInInitializerError> sutFactory;

    @Override
    public Callable<ExceptionInInitializerError> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ExceptionInInitializerError]

}
