package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageWriterSpiClassTest
implements org.j8unit.repository.javax.imageio.spi.ImageWriterSpiClassTests<javax.imageio.spi.ImageWriterSpi> {

    @Override
    public Class<javax.imageio.spi.ImageWriterSpi> createNewSUT() {
        return javax.imageio.spi.ImageWriterSpi.class;
    }

}
