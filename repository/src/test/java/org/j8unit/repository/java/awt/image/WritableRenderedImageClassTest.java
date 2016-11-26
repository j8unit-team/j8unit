package org.j8unit.repository.java.awt.image;

import java.awt.image.WritableRenderedImage;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WritableRenderedImage} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.WritableRenderedImageClassTests}).
 */
@RunWith(J8Unit4.class)
public class WritableRenderedImageClassTest
implements WritableRenderedImageClassTests<WritableRenderedImage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.WritableRenderedImage]

    @Override
    public Class<WritableRenderedImage> createNewSUT() {
        return WritableRenderedImage.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.WritableRenderedImage]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.WritableRenderedImage]

}
