package org.j8unit.repository.java.awt.geom;

import java.awt.geom.Dimension2D;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Dimension2D} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.geom.Dimension2DTests}).
 */
@RunWith(J8Unit4.class)
public class Dimension2DTest
implements Dimension2DTests<Dimension2D> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.geom.Dimension2D]

    @Override
    public Dimension2D createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.geom.Dimension2D], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.geom.Dimension2D]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.geom.Dimension2D]

}
