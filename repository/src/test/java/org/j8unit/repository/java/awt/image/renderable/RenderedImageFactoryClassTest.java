package org.j8unit.repository.java.awt.image.renderable;

import java.awt.image.renderable.RenderedImageFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RenderedImageFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.renderable.RenderedImageFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class RenderedImageFactoryClassTest
implements RenderedImageFactoryClassTests<RenderedImageFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.renderable.RenderedImageFactory]

    @Override
    public Class<RenderedImageFactory> createNewSUT() {
        return RenderedImageFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.renderable.RenderedImageFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.renderable.RenderedImageFactory]

}
