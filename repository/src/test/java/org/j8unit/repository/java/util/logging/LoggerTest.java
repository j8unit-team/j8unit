package org.j8unit.repository.java.util.logging;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LoggerTest
implements org.j8unit.repository.java.util.logging.LoggerTests<java.util.logging.Logger> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.util.logging.Logger.global);
    }

    @Parameter(0)
    public java.util.logging.Logger sut;

    @Override
    public java.util.logging.Logger createNewSUT() {
        return this.sut;
    }

}
