package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortBufferClassTest
implements org.j8unit.repository.java.nio.ShortBufferClassTests<java.nio.ShortBuffer> {

    @Override
    public Class<java.nio.ShortBuffer> createNewSUT() {
        return java.nio.ShortBuffer.class;
    }

}
