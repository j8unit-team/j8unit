package org.j8unit.repository.java.awt;

import java.awt.Shape;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShapeClassTest
implements org.j8unit.repository.java.awt.ShapeClassTests<Shape> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Shape]

    @Override
    public Class<Shape> createNewSUT() {
        return Shape.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Shape]

}
