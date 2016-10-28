package org.j8unit.repository.java.awt.image;

import java.awt.image.RenderedImage;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RenderedImageTest
implements org.j8unit.repository.java.awt.image.RenderedImageTests<RenderedImage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.RenderedImage]

    @Override
    public RenderedImage createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.RenderedImage], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.RenderedImage]

}
