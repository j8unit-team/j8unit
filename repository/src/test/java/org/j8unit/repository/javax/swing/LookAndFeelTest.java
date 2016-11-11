package org.j8unit.repository.javax.swing;

import javax.swing.LookAndFeel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LookAndFeel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.LookAndFeelTests}).
 */

@RunWith(J8Unit4.class)
public class LookAndFeelTest
implements LookAndFeelTests<LookAndFeel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.LookAndFeel]

    @Override
    public LookAndFeel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.LookAndFeel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.LookAndFeel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.LookAndFeel]

}
