package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.ImageInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageInputStreamClassTest
implements org.j8unit.repository.javax.imageio.stream.ImageInputStreamClassTests<ImageInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.ImageInputStream]

    @Override
    public Class<ImageInputStream> createNewSUT() {
        return ImageInputStream.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.ImageInputStream]

}
