package org.j8unit.repository.java.awt;

import java.awt.Shape;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShapeTest
implements org.j8unit.repository.java.awt.ShapeTests<Shape> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Shape]

    @Override
    public Shape createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Shape], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Shape]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Shape]

}
