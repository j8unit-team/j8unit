package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipExceptionTest
implements org.j8unit.repository.java.util.zip.ZipExceptionTests<java.util.zip.ZipException> {

    @Override
    public java.util.zip.ZipException createNewSUT() {
        return new java.util.zip.ZipException();
    }

}
