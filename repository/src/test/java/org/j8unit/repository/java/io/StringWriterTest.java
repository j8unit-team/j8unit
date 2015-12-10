package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringWriterTest
implements org.j8unit.repository.java.io.StringWriterTests<java.io.StringWriter> {

    @Override
    public java.io.StringWriter createNewSUT() {
        return new java.io.StringWriter();
    }

}
