package org.j8unit.repository.java.awt;

import java.awt.Shape;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Shape} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.awt.ShapeClassTests}).
 */
@RunWith(J8Unit4.class)
public class ShapeClassTest
implements ShapeClassTests<Shape> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Shape]

    @Override
    public Class<Shape> createNewSUT() {
        return Shape.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Shape]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Shape]

}
