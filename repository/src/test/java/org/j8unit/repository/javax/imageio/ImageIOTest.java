package org.j8unit.repository.javax.imageio;

import javax.imageio.ImageIO;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImageIO} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.imageio.ImageIOTests}).
 */

@RunWith(J8Unit4.class)
public class ImageIOTest
implements ImageIOTests<ImageIO> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.ImageIO]

    @Override
    public ImageIO createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.ImageIO], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.ImageIO]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.ImageIO]

}
