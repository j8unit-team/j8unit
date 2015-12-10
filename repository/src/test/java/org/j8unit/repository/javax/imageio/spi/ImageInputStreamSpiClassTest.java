package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageInputStreamSpiClassTest
implements org.j8unit.repository.javax.imageio.spi.ImageInputStreamSpiClassTests<javax.imageio.spi.ImageInputStreamSpi> {

    @Override
    public Class<javax.imageio.spi.ImageInputStreamSpi> createNewSUT() {
        return javax.imageio.spi.ImageInputStreamSpi.class;
    }

}
