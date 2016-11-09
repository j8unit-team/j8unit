package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.ScrollPaneUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ScrollPaneUI} (by simply reusing the
 * J8Unit test interface {@link ScrollPaneUITests}).
 */

@RunWith(J8Unit4.class)
public class ScrollPaneUITest
implements ScrollPaneUITests<ScrollPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.ScrollPaneUI]

    @Override
    public ScrollPaneUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.ScrollPaneUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.ScrollPaneUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.ScrollPaneUI]

}
