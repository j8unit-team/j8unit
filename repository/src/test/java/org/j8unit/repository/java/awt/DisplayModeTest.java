package org.j8unit.repository.java.awt;

import java.awt.DisplayMode;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DisplayMode} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.DisplayModeTests}).
 */

@RunWith(J8Unit4.class)
public class DisplayModeTest
implements DisplayModeTests<DisplayMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.DisplayMode]

    @Override
    public DisplayMode createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.DisplayMode], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.DisplayMode]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.DisplayMode]

}
