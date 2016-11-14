package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.SeparatorUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SeparatorUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.SeparatorUITests}).
 */

@RunWith(J8Unit4.class)
public class SeparatorUITest
implements SeparatorUITests<SeparatorUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.SeparatorUI]

    @Override
    public SeparatorUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.SeparatorUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.SeparatorUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.SeparatorUI]

}
