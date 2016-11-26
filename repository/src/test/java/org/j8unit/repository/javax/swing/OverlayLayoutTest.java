package org.j8unit.repository.javax.swing;

import javax.swing.OverlayLayout;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OverlayLayout} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.OverlayLayoutTests}).
 */
@RunWith(J8Unit4.class)
public class OverlayLayoutTest
implements OverlayLayoutTests<OverlayLayout> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.OverlayLayout]

    @Override
    public OverlayLayout createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.OverlayLayout], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.OverlayLayout]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.OverlayLayout]

}
