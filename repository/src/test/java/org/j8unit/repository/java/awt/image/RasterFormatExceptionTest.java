package org.j8unit.repository.java.awt.image;

import java.awt.image.RasterFormatException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RasterFormatExceptionTest
implements org.j8unit.repository.java.awt.image.RasterFormatExceptionTests<RasterFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.RasterFormatException]

    @Override
    public RasterFormatException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.RasterFormatException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.RasterFormatException]

}
