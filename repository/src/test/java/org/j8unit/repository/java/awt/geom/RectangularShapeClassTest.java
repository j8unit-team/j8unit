package org.j8unit.repository.java.awt.geom;

import java.awt.geom.RectangularShape;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RectangularShape} (by simply reusing the
 * J8Unit test interface {@link RectangularShapeClassTests}).
 */

@RunWith(J8Unit4.class)
public class RectangularShapeClassTest
implements RectangularShapeClassTests<RectangularShape> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.geom.RectangularShape]

    @Override
    public Class<RectangularShape> createNewSUT() {
        return RectangularShape.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.geom.RectangularShape]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.geom.RectangularShape]

}
