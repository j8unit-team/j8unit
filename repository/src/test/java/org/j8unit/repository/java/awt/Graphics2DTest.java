package org.j8unit.repository.java.awt;

import java.awt.Graphics2D;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Graphics2D} (by simply reusing the
 * J8Unit test interface {@link Graphics2DTests}).
 */

@RunWith(J8Unit4.class)
public class Graphics2DTest
implements Graphics2DTests<Graphics2D> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Graphics2D]

    @Override
    public Graphics2D createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Graphics2D], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Graphics2D]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Graphics2D]

}
