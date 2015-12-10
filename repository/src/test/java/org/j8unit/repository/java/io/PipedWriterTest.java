package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipedWriterTest
implements org.j8unit.repository.java.io.PipedWriterTests<java.io.PipedWriter> {

    @Override
    public java.io.PipedWriter createNewSUT() {
        return new java.io.PipedWriter();
    }

}
