package org.j8unit.repository.java.awt.image;

import java.awt.image.RenderedImage;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RenderedImage} (by simply reusing the
 * J8Unit test interface {@link RenderedImageTests}).
 */

@RunWith(J8Unit4.class)
public class RenderedImageTest
implements RenderedImageTests<RenderedImage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.RenderedImage]

    @Override
    public RenderedImage createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.RenderedImage], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.RenderedImage]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.RenderedImage]

}
