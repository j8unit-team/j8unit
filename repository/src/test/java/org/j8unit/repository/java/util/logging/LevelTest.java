package org.j8unit.repository.java.util.logging;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.logging.Level;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LevelTest
implements org.j8unit.repository.java.util.logging.LevelTests<Level> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.Level]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Level.OFF, //
                                Level.WARNING, //
                                Level.INFO, //
                                Level.FINE, //
                                Level.FINEST, //
                                Level.FINER, //
                                Level.SEVERE, //
                                Level.ALL, //
                                Level.CONFIG);
    }

    @Parameter(0)
    public Level sut;

    @Override
    public Level createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.Level]

}
