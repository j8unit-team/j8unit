package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongBufferClassTest
implements org.j8unit.repository.java.nio.LongBufferClassTests<java.nio.LongBuffer> {

    @Override
    public Class<java.nio.LongBuffer> createNewSUT() {
        return java.nio.LongBuffer.class;
    }

}
