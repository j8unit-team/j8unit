package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipEntryClassTest
implements org.j8unit.repository.java.util.zip.ZipEntryClassTests<java.util.zip.ZipEntry> {

    @Override
    public Class<java.util.zip.ZipEntry> createNewSUT() {
        return java.util.zip.ZipEntry.class;
    }

}
