package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipErrorTest
implements org.j8unit.repository.java.util.zip.ZipErrorTests<java.util.zip.ZipError> {

    @Override
    public java.util.zip.ZipError createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.zip.ZipError] available.");
    }

}
