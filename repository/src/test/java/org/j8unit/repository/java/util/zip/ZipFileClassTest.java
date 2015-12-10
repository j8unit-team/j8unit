package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipFileClassTest
implements org.j8unit.repository.java.util.zip.ZipFileClassTests<java.util.zip.ZipFile> {

    @Override
    public Class<java.util.zip.ZipFile> createNewSUT() {
        return java.util.zip.ZipFile.class;
    }

}
