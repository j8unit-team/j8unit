package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.ImageReaderSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImageReaderSpi} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.spi.ImageReaderSpiTests}).
 */

@RunWith(J8Unit4.class)
public class ImageReaderSpiTest
implements ImageReaderSpiTests<ImageReaderSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ImageReaderSpi]

    @Override
    public ImageReaderSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.spi.ImageReaderSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.spi.ImageReaderSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.spi.ImageReaderSpi]

}
