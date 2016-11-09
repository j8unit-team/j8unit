package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.RootPaneUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RootPaneUI} (by simply reusing the
 * J8Unit test interface {@link RootPaneUITests}).
 */

@RunWith(J8Unit4.class)
public class RootPaneUITest
implements RootPaneUITests<RootPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.RootPaneUI]

    @Override
    public RootPaneUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.RootPaneUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.RootPaneUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.RootPaneUI]

}
