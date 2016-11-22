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
public class InstantiationErrorTest
implements FactoryBasedJ8UnitTest<InstantiationError>, InstantiationErrorTests<InstantiationError> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.InstantiationError]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(InstantiationError::new);
    }

    @Parameter(0)
    public Callable<InstantiationError> sutFactory;

    @Override
    public Callable<InstantiationError> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.InstantiationError]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.InstantiationError]

}
