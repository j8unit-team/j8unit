package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OutputStreamWriterClassTest
implements org.j8unit.repository.java.io.OutputStreamWriterClassTests<java.io.OutputStreamWriter> {

    @Override
    public Class<java.io.OutputStreamWriter> createNewSUT() {
        return java.io.OutputStreamWriter.class;
    }

}
