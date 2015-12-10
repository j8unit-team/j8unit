package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferUnderflowExceptionClassTest
implements org.j8unit.repository.java.nio.BufferUnderflowExceptionClassTests<java.nio.BufferUnderflowException> {

    @Override
    public Class<java.nio.BufferUnderflowException> createNewSUT() {
        return java.nio.BufferUnderflowException.class;
    }

}
