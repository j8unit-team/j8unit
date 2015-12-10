package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileWriterClassTest
implements org.j8unit.repository.java.io.FileWriterClassTests<java.io.FileWriter> {

    @Override
    public Class<java.io.FileWriter> createNewSUT() {
        return java.io.FileWriter.class;
    }

}
