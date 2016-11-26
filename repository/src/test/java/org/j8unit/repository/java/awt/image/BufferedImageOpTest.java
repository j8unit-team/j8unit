package org.j8unit.repository.java.awt.image;

import java.awt.image.BufferedImageOp;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BufferedImageOp} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.BufferedImageOpTests}).
 */
@RunWith(J8Unit4.class)
public class BufferedImageOpTest
implements BufferedImageOpTests<BufferedImageOp> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.BufferedImageOp]

    @Override
    public BufferedImageOp createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.BufferedImageOp], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.BufferedImageOp]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.BufferedImageOp]

}
