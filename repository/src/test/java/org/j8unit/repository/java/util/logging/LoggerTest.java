package org.j8unit.repository.java.util.logging;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.logging.Logger;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class LoggerTest
implements org.j8unit.repository.java.util.logging.LoggerTests<Logger> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.Logger]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Logger.global);
    }

    @Parameter(0)
    public Logger sut;

    @Override
    public Logger createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.Logger]

}
