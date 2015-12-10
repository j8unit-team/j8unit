package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipedReaderClassTest
implements org.j8unit.repository.java.io.PipedReaderClassTests<java.io.PipedReader> {

    @Override
    public Class<java.io.PipedReader> createNewSUT() {
        return java.io.PipedReader.class;
    }

}
