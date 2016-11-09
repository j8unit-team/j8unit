package org.j8unit.repository.java.awt;

import java.awt.AWTKeyStroke;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AWTKeyStroke} (by simply reusing the
 * J8Unit test interface {@link AWTKeyStrokeTests}).
 */

@RunWith(J8Unit4.class)
public class AWTKeyStrokeTest
implements AWTKeyStrokeTests<AWTKeyStroke> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.AWTKeyStroke]

    @Override
    public AWTKeyStroke createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.AWTKeyStroke], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.AWTKeyStroke]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.AWTKeyStroke]

}
