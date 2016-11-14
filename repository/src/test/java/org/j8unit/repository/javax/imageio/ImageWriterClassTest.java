package org.j8unit.repository.javax.imageio;

import javax.imageio.ImageWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageWriter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.imageio.ImageWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class ImageWriterClassTest
implements ImageWriterClassTests<ImageWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.ImageWriter]

    @Override
    public Class<ImageWriter> createNewSUT() {
        return ImageWriter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.ImageWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.ImageWriter]

}
