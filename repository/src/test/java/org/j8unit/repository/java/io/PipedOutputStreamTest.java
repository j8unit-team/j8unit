package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipedOutputStreamTest
implements org.j8unit.repository.java.io.PipedOutputStreamTests<java.io.PipedOutputStream> {

    @Override
    public java.io.PipedOutputStream createNewSUT() {
        return new java.io.PipedOutputStream();
    }

}
