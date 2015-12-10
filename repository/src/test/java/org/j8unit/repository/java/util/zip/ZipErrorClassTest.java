package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipErrorClassTest
implements org.j8unit.repository.java.util.zip.ZipErrorClassTests<java.util.zip.ZipError> {

    @Override
    public Class<java.util.zip.ZipError> createNewSUT() {
        return java.util.zip.ZipError.class;
    }

}
