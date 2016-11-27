package org.j8unit.repository.java.util.logging;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.logging.Logger;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Logger} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.logging.LoggerTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LoggerTest
implements LoggerTests<Logger> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.Logger]

    @Parameters(name = "{index}: {0}")
    @SuppressWarnings("deprecation")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Logger.global);
    }

    @Parameter(0)
    public Logger sut;

    @Override
    public Logger createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.Logger]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.Logger]

}
