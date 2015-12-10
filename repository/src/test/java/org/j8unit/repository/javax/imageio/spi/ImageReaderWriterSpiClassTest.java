package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageReaderWriterSpiClassTest
implements org.j8unit.repository.javax.imageio.spi.ImageReaderWriterSpiClassTests<javax.imageio.spi.ImageReaderWriterSpi> {

    @Override
    public Class<javax.imageio.spi.ImageReaderWriterSpi> createNewSUT() {
        return javax.imageio.spi.ImageReaderWriterSpi.class;
    }

}
