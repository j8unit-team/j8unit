package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipedInputStreamTest
implements org.j8unit.repository.java.io.PipedInputStreamTests<java.io.PipedInputStream> {

    @Override
    public java.io.PipedInputStream createNewSUT() {
        return new java.io.PipedInputStream();
    }

}
