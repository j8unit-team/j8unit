package org.j8unit.repository.java.awt.image;

import java.awt.image.ImageProducer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageProducer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.ImageProducerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ImageProducerClassTest
implements ImageProducerClassTests<ImageProducer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.ImageProducer]

    @Override
    public Class<ImageProducer> createNewSUT() {
        return ImageProducer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.ImageProducer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.ImageProducer]

}
