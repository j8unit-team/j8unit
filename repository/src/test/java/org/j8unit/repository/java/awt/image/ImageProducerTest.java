package org.j8unit.repository.java.awt.image;

import java.awt.image.ImageProducer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageProducerTest
implements org.j8unit.repository.java.awt.image.ImageProducerTests<ImageProducer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.ImageProducer]

    @Override
    public ImageProducer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.ImageProducer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.ImageProducer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.ImageProducer]

}
