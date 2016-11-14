package org.j8unit.repository.javax.imageio;

import javax.imageio.ImageTranscoder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageTranscoder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.imageio.ImageTranscoderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ImageTranscoderClassTest
implements ImageTranscoderClassTests<ImageTranscoder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.ImageTranscoder]

    @Override
    public Class<ImageTranscoder> createNewSUT() {
        return ImageTranscoder.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.ImageTranscoder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.ImageTranscoder]

}
