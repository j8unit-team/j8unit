package org.j8unit.repository.java.awt.image.renderable;

import java.awt.image.renderable.RenderableImageOp;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RenderableImageOp} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.renderable.RenderableImageOpTests}).
 */
@RunWith(J8Unit4.class)
public class RenderableImageOpTest
implements RenderableImageOpTests<RenderableImageOp> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.renderable.RenderableImageOp]

    @Override
    public RenderableImageOp createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.renderable.RenderableImageOp], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.renderable.RenderableImageOp]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.renderable.RenderableImageOp]

}
