package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferedReaderClassTest
implements org.j8unit.repository.java.io.BufferedReaderClassTests<java.io.BufferedReader> {

    @Override
    public Class<java.io.BufferedReader> createNewSUT() {
        return java.io.BufferedReader.class;
    }

}
