package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipedInputStreamClassTest
implements org.j8unit.repository.java.io.PipedInputStreamClassTests<java.io.PipedInputStream> {

    @Override
    public Class<java.io.PipedInputStream> createNewSUT() {
        return java.io.PipedInputStream.class;
    }

}
