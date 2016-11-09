package org.j8unit.repository.java.awt.geom;

import java.awt.geom.RectangularShape;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RectangularShape} (by simply reusing
 * the J8Unit test interface {@link RectangularShapeTests}).
 */

@RunWith(J8Unit4.class)
public class RectangularShapeTest
implements RectangularShapeTests<RectangularShape> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.geom.RectangularShape]

    @Override
    public RectangularShape createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.geom.RectangularShape], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.geom.RectangularShape]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.geom.RectangularShape]

}
