package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.ImageOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageOutputStream} (by simply reusing the
 * J8Unit test interface {@link ImageOutputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class ImageOutputStreamClassTest
implements ImageOutputStreamClassTests<ImageOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.ImageOutputStream]

    @Override
    public Class<ImageOutputStream> createNewSUT() {
        return ImageOutputStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.stream.ImageOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.ImageOutputStream]

}
