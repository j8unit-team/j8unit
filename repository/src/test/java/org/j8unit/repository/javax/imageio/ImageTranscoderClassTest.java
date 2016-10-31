package org.j8unit.repository.javax.imageio;

import javax.imageio.ImageTranscoder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageTranscoderClassTest
implements org.j8unit.repository.javax.imageio.ImageTranscoderClassTests<ImageTranscoder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.ImageTranscoder]

    @Override
    public Class<ImageTranscoder> createNewSUT() {
        return ImageTranscoder.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.ImageTranscoder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.ImageTranscoder]

}
