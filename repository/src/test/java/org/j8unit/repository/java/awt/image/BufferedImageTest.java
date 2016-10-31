package org.j8unit.repository.java.awt.image;

import java.awt.image.BufferedImage;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferedImageTest
implements org.j8unit.repository.java.awt.image.BufferedImageTests<BufferedImage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.BufferedImage]

    @Override
    public BufferedImage createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.BufferedImage], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.BufferedImage]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.BufferedImage]

}
