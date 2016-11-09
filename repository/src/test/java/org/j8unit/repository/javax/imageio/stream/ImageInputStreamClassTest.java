package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.ImageInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageInputStream} (by simply reusing the
 * J8Unit test interface {@link ImageInputStreamClassTests}).
 */

@RunWith(J8Unit4.class)
public class ImageInputStreamClassTest
implements ImageInputStreamClassTests<ImageInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.ImageInputStream]

    @Override
    public Class<ImageInputStream> createNewSUT() {
        return ImageInputStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.stream.ImageInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.ImageInputStream]

}
