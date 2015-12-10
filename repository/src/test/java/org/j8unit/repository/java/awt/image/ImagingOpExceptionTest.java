package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImagingOpExceptionTest
implements org.j8unit.repository.java.awt.image.ImagingOpExceptionTests<java.awt.image.ImagingOpException> {

    @Override
    public java.awt.image.ImagingOpException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.image.ImagingOpException] available.");
    }

}
