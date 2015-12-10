package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteArrayOutputStreamTest
implements org.j8unit.repository.java.io.ByteArrayOutputStreamTests<java.io.ByteArrayOutputStream> {

    @Override
    public java.io.ByteArrayOutputStream createNewSUT() {
        return new java.io.ByteArrayOutputStream();
    }

}
