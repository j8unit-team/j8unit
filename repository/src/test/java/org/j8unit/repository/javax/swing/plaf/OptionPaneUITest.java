package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.OptionPaneUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OptionPaneUI} (by simply reusing the
 * J8Unit test interface {@link OptionPaneUITests}).
 */

@RunWith(J8Unit4.class)
public class OptionPaneUITest
implements OptionPaneUITests<OptionPaneUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.OptionPaneUI]

    @Override
    public OptionPaneUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.OptionPaneUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.OptionPaneUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.OptionPaneUI]

}
