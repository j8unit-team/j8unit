package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageReaderClassTest
implements org.j8unit.repository.javax.imageio.ImageReaderClassTests<javax.imageio.ImageReader> {

    @Override
    public Class<javax.imageio.ImageReader> createNewSUT() {
        return javax.imageio.ImageReader.class;
    }

}
