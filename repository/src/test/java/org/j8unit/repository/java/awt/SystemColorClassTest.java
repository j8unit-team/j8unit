package org.j8unit.repository.java.awt;

import java.awt.SystemColor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SystemColor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.SystemColorClassTests}).
 */

@RunWith(J8Unit4.class)
public class SystemColorClassTest
implements SystemColorClassTests<SystemColor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.SystemColor]

    @Override
    public Class<SystemColor> createNewSUT() {
        return SystemColor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.SystemColor]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.SystemColor]

}
