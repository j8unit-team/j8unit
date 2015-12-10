package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageTranscoderSpiClassTest
implements org.j8unit.repository.javax.imageio.spi.ImageTranscoderSpiClassTests<javax.imageio.spi.ImageTranscoderSpi> {

    @Override
    public Class<javax.imageio.spi.ImageTranscoderSpi> createNewSUT() {
        return javax.imageio.spi.ImageTranscoderSpi.class;
    }

}
