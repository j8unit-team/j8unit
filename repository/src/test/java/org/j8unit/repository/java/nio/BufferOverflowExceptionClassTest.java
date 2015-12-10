package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferOverflowExceptionClassTest
implements org.j8unit.repository.java.nio.BufferOverflowExceptionClassTests<java.nio.BufferOverflowException> {

    @Override
    public Class<java.nio.BufferOverflowException> createNewSUT() {
        return java.nio.BufferOverflowException.class;
    }

}
