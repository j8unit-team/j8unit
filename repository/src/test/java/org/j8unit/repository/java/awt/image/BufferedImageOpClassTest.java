package org.j8unit.repository.java.awt.image;

import java.awt.image.BufferedImageOp;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BufferedImageOp} (by simply reusing the
 * J8Unit test interface {@link BufferedImageOpClassTests}).
 */

@RunWith(J8Unit4.class)
public class BufferedImageOpClassTest
implements BufferedImageOpClassTests<BufferedImageOp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.BufferedImageOp]

    @Override
    public Class<BufferedImageOp> createNewSUT() {
        return BufferedImageOp.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.BufferedImageOp]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.BufferedImageOp]

}
