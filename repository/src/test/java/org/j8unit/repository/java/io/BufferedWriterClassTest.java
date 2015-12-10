package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferedWriterClassTest
implements org.j8unit.repository.java.io.BufferedWriterClassTests<java.io.BufferedWriter> {

    @Override
    public Class<java.io.BufferedWriter> createNewSUT() {
        return java.io.BufferedWriter.class;
    }

}
