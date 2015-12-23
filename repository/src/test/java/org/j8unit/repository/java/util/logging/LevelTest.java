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
public class LevelTest
implements org.j8unit.repository.java.util.logging.LevelTests<java.util.logging.Level> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.util.logging.Level.OFF, //
                                java.util.logging.Level.WARNING, //
                                java.util.logging.Level.INFO, //
                                java.util.logging.Level.FINE, //
                                java.util.logging.Level.FINEST, //
                                java.util.logging.Level.FINER, //
                                java.util.logging.Level.SEVERE, //
                                java.util.logging.Level.ALL, //
                                java.util.logging.Level.CONFIG);
    }

    @Parameter(0)
    public java.util.logging.Level sut;

    @Override
    public java.util.logging.Level createNewSUT() {
        return this.sut;
    }

}
