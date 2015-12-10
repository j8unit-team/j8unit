package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MappedByteBufferClassTest
implements org.j8unit.repository.java.nio.MappedByteBufferClassTests<java.nio.MappedByteBuffer> {

    @Override
    public Class<java.nio.MappedByteBuffer> createNewSUT() {
        return java.nio.MappedByteBuffer.class;
    }

}
