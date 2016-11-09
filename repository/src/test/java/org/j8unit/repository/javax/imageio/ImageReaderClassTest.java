package org.j8unit.repository.javax.imageio;

import javax.imageio.ImageReader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageReader} (by simply reusing the
 * J8Unit test interface {@link ImageReaderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ImageReaderClassTest
implements ImageReaderClassTests<ImageReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.ImageReader]

    @Override
    public Class<ImageReader> createNewSUT() {
        return ImageReader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.ImageReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.ImageReader]

}
