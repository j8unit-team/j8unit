package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.ImageTranscoderSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageTranscoderSpiTest
implements org.j8unit.repository.javax.imageio.spi.ImageTranscoderSpiTests<ImageTranscoderSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ImageTranscoderSpi]

    @Override
    public ImageTranscoderSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.spi.ImageTranscoderSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ImageTranscoderSpi]

}
