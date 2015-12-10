package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageOutputStreamSpiClassTest
implements org.j8unit.repository.javax.imageio.spi.ImageOutputStreamSpiClassTests<javax.imageio.spi.ImageOutputStreamSpi> {

    @Override
    public Class<javax.imageio.spi.ImageOutputStreamSpi> createNewSUT() {
        return javax.imageio.spi.ImageOutputStreamSpi.class;
    }

}
