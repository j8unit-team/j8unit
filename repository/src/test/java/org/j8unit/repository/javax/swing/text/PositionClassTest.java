package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Position;
import javax.swing.text.Position.Bias;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Position} (by simply reusing the J8Unit
 * test interface {@link PositionClassTests}).
 */

@RunWith(J8Unit4.class)
public class PositionClassTest
implements PositionClassTests<Position> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Position]

    @Override
    public Class<Position> createNewSUT() {
        return Position.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Position]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Position]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Bias} (by simply reusing the J8Unit
     * test interface {@link BiasClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BiasClassTest
    implements BiasClassTests<Bias> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Position$Bias]

        @Override
        public Class<Bias> createNewSUT() {
            return Bias.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Position$Bias]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Position$Bias]

    }

}
