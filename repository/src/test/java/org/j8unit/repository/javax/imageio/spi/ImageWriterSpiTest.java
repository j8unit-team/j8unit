package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.ImageWriterSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImageWriterSpi} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.spi.ImageWriterSpiTests}).
 */

@RunWith(J8Unit4.class)
public class ImageWriterSpiTest
implements ImageWriterSpiTests<ImageWriterSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ImageWriterSpi]

    @Override
    public ImageWriterSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.spi.ImageWriterSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.spi.ImageWriterSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.spi.ImageWriterSpi]

}
