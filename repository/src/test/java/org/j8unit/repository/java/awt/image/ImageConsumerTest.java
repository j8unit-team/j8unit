package org.j8unit.repository.java.awt.image;

import java.awt.image.ImageConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageConsumerTest
implements org.j8unit.repository.java.awt.image.ImageConsumerTests<ImageConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.ImageConsumer]

    @Override
    public ImageConsumer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.ImageConsumer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.ImageConsumer]

}
