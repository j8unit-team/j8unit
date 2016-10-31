package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.ImageInputStreamSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageInputStreamSpiTest
implements org.j8unit.repository.javax.imageio.spi.ImageInputStreamSpiTests<ImageInputStreamSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ImageInputStreamSpi]

    @Override
    public ImageInputStreamSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.spi.ImageInputStreamSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.spi.ImageInputStreamSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.spi.ImageInputStreamSpi]

}
