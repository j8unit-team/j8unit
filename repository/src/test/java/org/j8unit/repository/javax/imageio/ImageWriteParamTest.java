package org.j8unit.repository.javax.imageio;

import javax.imageio.ImageWriteParam;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImageWriteParam} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.ImageWriteParamTests}).
 */

@RunWith(J8Unit4.class)
public class ImageWriteParamTest
implements ImageWriteParamTests<ImageWriteParam> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.ImageWriteParam]

    @Override
    public ImageWriteParam createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.ImageWriteParam], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.ImageWriteParam]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.ImageWriteParam]

}
