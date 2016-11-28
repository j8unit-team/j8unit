package org.j8unit.repository.java.awt.image.renderable;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ContextualRenderedImageFactory} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.awt.image.renderable.ContextualRenderedImageFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class ContextualRenderedImageFactoryClassTest
implements ContextualRenderedImageFactoryClassTests<ContextualRenderedImageFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.renderable.ContextualRenderedImageFactory]

    @Override
    public Class<ContextualRenderedImageFactory> createNewSUT() {
        return ContextualRenderedImageFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.renderable.ContextualRenderedImageFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.renderable.ContextualRenderedImageFactory]

}
