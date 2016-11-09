package org.j8unit.repository.java.awt.image;

import java.awt.image.ImageConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImageConsumer} (by simply reusing the
 * J8Unit test interface {@link ImageConsumerTests}).
 */

@RunWith(J8Unit4.class)
public class ImageConsumerTest
implements ImageConsumerTests<ImageConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.ImageConsumer]

    @Override
    public ImageConsumer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.ImageConsumer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.ImageConsumer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.ImageConsumer]

}
