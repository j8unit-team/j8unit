package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageWriterClassTest
implements org.j8unit.repository.javax.imageio.ImageWriterClassTests<javax.imageio.ImageWriter> {

    @Override
    public Class<javax.imageio.ImageWriter> createNewSUT() {
        return javax.imageio.ImageWriter.class;
    }

}
