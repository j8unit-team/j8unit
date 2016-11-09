package org.j8unit.repository.java.awt.geom;

import java.awt.geom.Dimension2D;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Dimension2D} (by simply reusing the
 * J8Unit test interface {@link Dimension2DClassTests}).
 */

@RunWith(J8Unit4.class)
public class Dimension2DClassTest
implements Dimension2DClassTests<Dimension2D> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.geom.Dimension2D]

    @Override
    public Class<Dimension2D> createNewSUT() {
        return Dimension2D.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.geom.Dimension2D]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.geom.Dimension2D]

}
