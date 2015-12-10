package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CRC32Test
implements org.j8unit.repository.java.util.zip.CRC32Tests<java.util.zip.CRC32> {

    @Override
    public java.util.zip.CRC32 createNewSUT() {
        return new java.util.zip.CRC32();
    }

}
