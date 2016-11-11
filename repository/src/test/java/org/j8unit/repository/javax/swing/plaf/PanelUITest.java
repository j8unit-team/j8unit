package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.PanelUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PanelUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.PanelUITests}).
 */

@RunWith(J8Unit4.class)
public class PanelUITest
implements PanelUITests<PanelUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.PanelUI]

    @Override
    public PanelUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.PanelUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.PanelUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.PanelUI]

}
