package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteArrayInputStreamClassTest
implements org.j8unit.repository.java.io.ByteArrayInputStreamClassTests<java.io.ByteArrayInputStream> {

    @Override
    public Class<java.io.ByteArrayInputStream> createNewSUT() {
        return java.io.ByteArrayInputStream.class;
    }

}
