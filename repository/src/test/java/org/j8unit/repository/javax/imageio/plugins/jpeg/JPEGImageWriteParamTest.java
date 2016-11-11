package org.j8unit.repository.javax.imageio.plugins.jpeg;

import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JPEGImageWriteParam} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.imageio.plugins.jpeg.JPEGImageWriteParamTests}).
 */

@RunWith(J8Unit4.class)
public class JPEGImageWriteParamTest
implements JPEGImageWriteParamTests<JPEGImageWriteParam> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGImageWriteParam]

    @Override
    public JPEGImageWriteParam createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.plugins.jpeg.JPEGImageWriteParam], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGImageWriteParam]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.plugins.jpeg.JPEGImageWriteParam]

}
