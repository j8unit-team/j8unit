package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChecksumClassTest
implements org.j8unit.repository.java.util.zip.ChecksumClassTests<java.util.zip.Checksum> {

    @Override
    public Class<java.util.zip.Checksum> createNewSUT() {
        return java.util.zip.Checksum.class;
    }

}
