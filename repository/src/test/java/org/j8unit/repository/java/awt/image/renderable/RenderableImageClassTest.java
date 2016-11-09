package org.j8unit.repository.java.awt.image.renderable;

import java.awt.image.renderable.RenderableImage;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RenderableImage} (by simply reusing the
 * J8Unit test interface {@link RenderableImageClassTests}).
 */

@RunWith(J8Unit4.class)
public class RenderableImageClassTest
implements RenderableImageClassTests<RenderableImage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.renderable.RenderableImage]

    @Override
    public Class<RenderableImage> createNewSUT() {
        return RenderableImage.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.renderable.RenderableImage]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.renderable.RenderableImage]

}
