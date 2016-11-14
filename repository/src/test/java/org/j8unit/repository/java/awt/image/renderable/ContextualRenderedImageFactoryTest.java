package org.j8unit.repository.java.awt.image.renderable;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ContextualRenderedImageFactory} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.awt.image.renderable.ContextualRenderedImageFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class ContextualRenderedImageFactoryTest
implements ContextualRenderedImageFactoryTests<ContextualRenderedImageFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.renderable.ContextualRenderedImageFactory]

    @Override
    public ContextualRenderedImageFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.renderable.ContextualRenderedImageFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.renderable.ContextualRenderedImageFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.renderable.ContextualRenderedImageFactory]

}
