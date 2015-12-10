package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileReaderClassTest
implements org.j8unit.repository.java.io.FileReaderClassTests<java.io.FileReader> {

    @Override
    public Class<java.io.FileReader> createNewSUT() {
        return java.io.FileReader.class;
    }

}
