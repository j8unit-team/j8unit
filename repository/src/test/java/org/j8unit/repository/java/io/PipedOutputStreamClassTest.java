package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipedOutputStreamClassTest
implements org.j8unit.repository.java.io.PipedOutputStreamClassTests<java.io.PipedOutputStream> {

    @Override
    public Class<java.io.PipedOutputStream> createNewSUT() {
        return java.io.PipedOutputStream.class;
    }

}
