package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteBufferClassTest
implements org.j8unit.repository.java.nio.ByteBufferClassTests<java.nio.ByteBuffer> {

    @Override
    public Class<java.nio.ByteBuffer> createNewSUT() {
        return java.nio.ByteBuffer.class;
    }

}
