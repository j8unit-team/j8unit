package org.j8unit.repository.javax.swing;

import javax.swing.DesktopManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DesktopManager} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.DesktopManagerTests}).
 */

@RunWith(J8Unit4.class)
public class DesktopManagerTest
implements DesktopManagerTests<DesktopManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DesktopManager]

    @Override
    public DesktopManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.DesktopManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.DesktopManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.DesktopManager]

}
