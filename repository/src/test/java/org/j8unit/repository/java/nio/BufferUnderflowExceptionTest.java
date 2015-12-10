package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferUnderflowExceptionTest
implements org.j8unit.repository.java.nio.BufferUnderflowExceptionTests<java.nio.BufferUnderflowException> {

    @Override
    public java.nio.BufferUnderflowException createNewSUT() {
        return new java.nio.BufferUnderflowException();
    }

}
