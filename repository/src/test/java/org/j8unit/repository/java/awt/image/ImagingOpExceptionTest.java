package org.j8unit.repository.java.awt.image;

import java.awt.image.ImagingOpException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImagingOpExceptionTest
implements org.j8unit.repository.java.awt.image.ImagingOpExceptionTests<ImagingOpException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.ImagingOpException]

    @Override
    public ImagingOpException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.ImagingOpException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.ImagingOpException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.ImagingOpException]

}
