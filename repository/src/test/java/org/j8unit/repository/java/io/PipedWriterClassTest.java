package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipedWriterClassTest
implements org.j8unit.repository.java.io.PipedWriterClassTests<java.io.PipedWriter> {

    @Override
    public Class<java.io.PipedWriter> createNewSUT() {
        return java.io.PipedWriter.class;
    }

}
