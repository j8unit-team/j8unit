package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.ImageInputStreamImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImageInputStreamImpl} (by simply
 * reusing the J8Unit test interface {@link ImageInputStreamImplTests}).
 */

@RunWith(J8Unit4.class)
public class ImageInputStreamImplTest
implements ImageInputStreamImplTests<ImageInputStreamImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.stream.ImageInputStreamImpl]

    @Override
    public ImageInputStreamImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.stream.ImageInputStreamImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.stream.ImageInputStreamImpl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.stream.ImageInputStreamImpl]

}
