package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.DesktopIconUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DesktopIconUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.DesktopIconUITests}).
 */
@RunWith(J8Unit4.class)
public class DesktopIconUITest
implements DesktopIconUITests<DesktopIconUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.DesktopIconUI]

    @Override
    public DesktopIconUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.DesktopIconUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.DesktopIconUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.DesktopIconUI]

}
