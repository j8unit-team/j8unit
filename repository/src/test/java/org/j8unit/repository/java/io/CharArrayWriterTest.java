package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharArrayWriterTest
implements org.j8unit.repository.java.io.CharArrayWriterTests<java.io.CharArrayWriter> {

    @Override
    public java.io.CharArrayWriter createNewSUT() {
        return new java.io.CharArrayWriter();
    }

}
