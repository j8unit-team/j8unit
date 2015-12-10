package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringWriterClassTest
implements org.j8unit.repository.java.io.StringWriterClassTests<java.io.StringWriter> {

    @Override
    public Class<java.io.StringWriter> createNewSUT() {
        return java.io.StringWriter.class;
    }

}
