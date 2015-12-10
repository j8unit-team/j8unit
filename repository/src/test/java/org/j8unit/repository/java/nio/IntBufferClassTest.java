package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntBufferClassTest
implements org.j8unit.repository.java.nio.IntBufferClassTests<java.nio.IntBuffer> {

    @Override
    public Class<java.nio.IntBuffer> createNewSUT() {
        return java.nio.IntBuffer.class;
    }

}
