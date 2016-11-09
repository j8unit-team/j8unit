package org.j8unit.repository.java.awt.image;

import java.awt.image.ImageProducer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImageProducer} (by simply reusing the
 * J8Unit test interface {@link ImageProducerTests}).
 */

@RunWith(J8Unit4.class)
public class ImageProducerTest
implements ImageProducerTests<ImageProducer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.ImageProducer]

    @Override
    public ImageProducer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.ImageProducer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.ImageProducer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.ImageProducer]

}
