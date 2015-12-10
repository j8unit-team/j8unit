package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamCorruptedExceptionTest
implements org.j8unit.repository.java.io.StreamCorruptedExceptionTests<java.io.StreamCorruptedException> {

    @Override
    public java.io.StreamCorruptedException createNewSUT() {
        return new java.io.StreamCorruptedException();
    }

}
