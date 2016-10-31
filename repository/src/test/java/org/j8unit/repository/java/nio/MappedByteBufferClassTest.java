package org.j8unit.repository.java.nio;

import java.nio.MappedByteBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MappedByteBufferClassTest
implements org.j8unit.repository.java.nio.MappedByteBufferClassTests<MappedByteBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.MappedByteBuffer]

    @Override
    public Class<MappedByteBuffer> createNewSUT() {
        return MappedByteBuffer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.MappedByteBuffer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.MappedByteBuffer]

}
