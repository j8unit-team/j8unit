package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EOFExceptionTest
implements org.j8unit.repository.java.io.EOFExceptionTests<java.io.EOFException> {

    @Override
    public java.io.EOFException createNewSUT() {
        return new java.io.EOFException();
    }

}
