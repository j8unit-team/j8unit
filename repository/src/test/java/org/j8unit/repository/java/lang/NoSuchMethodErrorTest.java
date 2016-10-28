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
public class NoSuchMethodErrorTest
implements FactoryBasedJ8UnitTest<NoSuchMethodError>, org.j8unit.repository.java.lang.NoSuchMethodErrorTests<NoSuchMethodError> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.NoSuchMethodError]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NoSuchMethodError::new);
    }

    @Parameter(0)
    public Callable<NoSuchMethodError> sutFactory;

    @Override
    public Callable<NoSuchMethodError> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.NoSuchMethodError]

}
