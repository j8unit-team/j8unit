package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.swing.text.Position;
import javax.swing.text.Position.Bias;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class PositionTest
implements org.j8unit.repository.javax.swing.text.PositionTests<Position> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Position]

    @Override
    public Position createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.Position], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Position]

    @RunWith(J8Unit4.class)
    public static class BiasTest
    implements org.j8unit.repository.javax.swing.text.PositionTests.BiasTests<Bias> {

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

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Position$Bias]

    }

}
