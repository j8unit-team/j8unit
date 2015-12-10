package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharArrayWriterClassTest
implements org.j8unit.repository.java.io.CharArrayWriterClassTests<java.io.CharArrayWriter> {

    @Override
    public Class<java.io.CharArrayWriter> createNewSUT() {
        return java.io.CharArrayWriter.class;
    }

}
