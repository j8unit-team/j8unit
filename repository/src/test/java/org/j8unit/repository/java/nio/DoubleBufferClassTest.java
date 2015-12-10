package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleBufferClassTest
implements org.j8unit.repository.java.nio.DoubleBufferClassTests<java.nio.DoubleBuffer> {

    @Override
    public Class<java.nio.DoubleBuffer> createNewSUT() {
        return java.nio.DoubleBuffer.class;
    }

}
