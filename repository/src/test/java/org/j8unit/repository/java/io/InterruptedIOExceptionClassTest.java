package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterruptedIOExceptionClassTest
implements org.j8unit.repository.java.io.InterruptedIOExceptionClassTests<java.io.InterruptedIOException> {

    @Override
    public Class<java.io.InterruptedIOException> createNewSUT() {
        return java.io.InterruptedIOException.class;
    }

}
