package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteArrayOutputStreamClassTest
implements org.j8unit.repository.java.io.ByteArrayOutputStreamClassTests<java.io.ByteArrayOutputStream> {

    @Override
    public Class<java.io.ByteArrayOutputStream> createNewSUT() {
        return java.io.ByteArrayOutputStream.class;
    }

}
