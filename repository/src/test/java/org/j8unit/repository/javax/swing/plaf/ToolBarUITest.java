package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.ToolBarUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ToolBarUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.ToolBarUITests}).
 */

@RunWith(J8Unit4.class)
public class ToolBarUITest
implements ToolBarUITests<ToolBarUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.ToolBarUI]

    @Override
    public ToolBarUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.ToolBarUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.ToolBarUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.ToolBarUI]

}
