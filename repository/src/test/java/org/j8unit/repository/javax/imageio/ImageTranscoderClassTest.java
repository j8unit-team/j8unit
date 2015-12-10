package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageTranscoderClassTest
implements org.j8unit.repository.javax.imageio.ImageTranscoderClassTests<javax.imageio.ImageTranscoder> {

    @Override
    public Class<javax.imageio.ImageTranscoder> createNewSUT() {
        return javax.imageio.ImageTranscoder.class;
    }

}
