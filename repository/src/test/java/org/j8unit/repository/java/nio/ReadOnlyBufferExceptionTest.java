package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReadOnlyBufferExceptionTest
implements org.j8unit.repository.java.nio.ReadOnlyBufferExceptionTests<java.nio.ReadOnlyBufferException> {

    @Override
    public java.nio.ReadOnlyBufferException createNewSUT() {
        return new java.nio.ReadOnlyBufferException();
    }

}
