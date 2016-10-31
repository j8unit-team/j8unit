package org.j8unit.repository.java.awt.image;

import java.awt.image.BufferedImageFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferedImageFilterTest
implements org.j8unit.repository.java.awt.image.BufferedImageFilterTests<BufferedImageFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.BufferedImageFilter]

    @Override
    public BufferedImageFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.BufferedImageFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.BufferedImageFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.BufferedImageFilter]

}
