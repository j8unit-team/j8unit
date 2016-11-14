package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.ImageOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImageOutputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.stream.ImageOutputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class ImageOutputStreamTest
implements ImageOutputStreamTests<ImageOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.stream.ImageOutputStream]

    @Override
    public ImageOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.stream.ImageOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.stream.ImageOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.stream.ImageOutputStream]

}
