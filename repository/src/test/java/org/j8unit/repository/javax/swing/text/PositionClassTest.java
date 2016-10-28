package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Position;
import javax.swing.text.Position.Bias;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PositionClassTest
implements org.j8unit.repository.javax.swing.text.PositionClassTests<Position> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Position]

    @Override
    public Class<Position> createNewSUT() {
        return Position.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Position]

    @RunWith(J8Unit4.class)
    public static class BiasClassTest
    implements org.j8unit.repository.javax.swing.text.PositionClassTests.BiasClassTests<Bias> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Position$Bias]

        @Override
        public Class<Bias> createNewSUT() {
            return Bias.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Position$Bias]

    }

}
