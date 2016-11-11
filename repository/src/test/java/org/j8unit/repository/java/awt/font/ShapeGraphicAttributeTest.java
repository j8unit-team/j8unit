package org.j8unit.repository.java.awt.font;

import java.awt.font.ShapeGraphicAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ShapeGraphicAttribute} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.font.ShapeGraphicAttributeTests}).
 */

@RunWith(J8Unit4.class)
public class ShapeGraphicAttributeTest
implements ShapeGraphicAttributeTests<ShapeGraphicAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.ShapeGraphicAttribute]

    @Override
    public ShapeGraphicAttribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.font.ShapeGraphicAttribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.ShapeGraphicAttribute]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.ShapeGraphicAttribute]

}
