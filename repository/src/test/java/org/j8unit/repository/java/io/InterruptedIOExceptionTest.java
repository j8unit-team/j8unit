package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterruptedIOExceptionTest
implements org.j8unit.repository.java.io.InterruptedIOExceptionTests<java.io.InterruptedIOException> {

    @Override
    public java.io.InterruptedIOException createNewSUT() {
        return new java.io.InterruptedIOException();
    }

}
