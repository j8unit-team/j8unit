package org.j8unit.repository.javax.imageio;

import javax.imageio.ImageWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageWriterClassTest
implements org.j8unit.repository.javax.imageio.ImageWriterClassTests<ImageWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.ImageWriter]

    @Override
    public Class<ImageWriter> createNewSUT() {
        return ImageWriter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.ImageWriter]

}
