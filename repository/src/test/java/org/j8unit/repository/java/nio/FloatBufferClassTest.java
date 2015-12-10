package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FloatBufferClassTest
implements org.j8unit.repository.java.nio.FloatBufferClassTests<java.nio.FloatBuffer> {

    @Override
    public Class<java.nio.FloatBuffer> createNewSUT() {
        return java.nio.FloatBuffer.class;
    }

}
