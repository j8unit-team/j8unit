package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageReaderSpiClassTest
implements org.j8unit.repository.javax.imageio.spi.ImageReaderSpiClassTests<javax.imageio.spi.ImageReaderSpi> {

    @Override
    public Class<javax.imageio.spi.ImageReaderSpi> createNewSUT() {
        return javax.imageio.spi.ImageReaderSpi.class;
    }

}
