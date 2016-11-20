package org.j8unit.repository.java.util.logging;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import java.util.logging.ErrorManager;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ErrorManagerTest
implements FactoryBasedJ8UnitTest<ErrorManager>, ErrorManagerTests<ErrorManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.ErrorManager]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ErrorManager::new);
    }

    @Parameter(0)
    public Callable<ErrorManager> sutFactory;

    @Override
    public Callable<ErrorManager> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.ErrorManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.ErrorManager]

}
