package org.j8unit.repository.javax.swing;

import javax.swing.DesktopManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DesktopManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.DesktopManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DesktopManagerClassTest
implements DesktopManagerClassTests<DesktopManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.DesktopManager]

    @Override
    public Class<DesktopManager> createNewSUT() {
        return DesktopManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.DesktopManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.DesktopManager]

}
