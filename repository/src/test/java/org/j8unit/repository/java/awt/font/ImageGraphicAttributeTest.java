package org.j8unit.repository.java.awt.font;

import java.awt.font.ImageGraphicAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImageGraphicAttribute} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.font.ImageGraphicAttributeTests}).
 */
@RunWith(J8Unit4.class)
public class ImageGraphicAttributeTest
implements ImageGraphicAttributeTests<ImageGraphicAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.ImageGraphicAttribute]

    @Override
    public ImageGraphicAttribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.font.ImageGraphicAttribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.ImageGraphicAttribute]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.ImageGraphicAttribute]

}
