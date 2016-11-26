package org.j8unit.repository.java.awt.image;

import java.awt.image.WritableRenderedImage;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WritableRenderedImage} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.image.WritableRenderedImageTests}).
 */
@RunWith(J8Unit4.class)
public class WritableRenderedImageTest
implements WritableRenderedImageTests<WritableRenderedImage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.WritableRenderedImage]

    @Override
    public WritableRenderedImage createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.WritableRenderedImage], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.WritableRenderedImage]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.WritableRenderedImage]

}
