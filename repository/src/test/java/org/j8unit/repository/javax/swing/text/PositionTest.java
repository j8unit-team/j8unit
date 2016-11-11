package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.swing.text.Position;
import javax.swing.text.Position.Bias;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Position} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.PositionTests}).
 */

@RunWith(J8Unit4.class)
public class PositionTest
implements PositionTests<Position> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Position]

    @Override
    public Position createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.Position], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Position]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Position]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Bias} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.PositionTests.BiasTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BiasTest
    implements BiasTests<Bias> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Position$Bias]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(Bias.Backward, //
                                    Bias.Forward);
        }

        @Parameter(0)
        public Bias sut;

        @Override
        public Bias createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Position$Bias]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Position$Bias]

    }

}
