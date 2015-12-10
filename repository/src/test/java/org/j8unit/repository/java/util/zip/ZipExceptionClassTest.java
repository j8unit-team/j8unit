package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipExceptionClassTest
implements org.j8unit.repository.java.util.zip.ZipExceptionClassTests<java.util.zip.ZipException> {

    @Override
    public Class<java.util.zip.ZipException> createNewSUT() {
        return java.util.zip.ZipException.class;
    }

}
