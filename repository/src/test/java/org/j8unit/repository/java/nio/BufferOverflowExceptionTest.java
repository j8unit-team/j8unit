package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferOverflowExceptionTest
implements org.j8unit.repository.java.nio.BufferOverflowExceptionTests<java.nio.BufferOverflowException> {

    @Override
    public java.nio.BufferOverflowException createNewSUT() {
        return new java.nio.BufferOverflowException();
    }

}
