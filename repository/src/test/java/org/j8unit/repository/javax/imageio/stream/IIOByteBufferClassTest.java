package org.j8unit.repository.javax.imageio.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOByteBufferClassTest
implements org.j8unit.repository.javax.imageio.stream.IIOByteBufferClassTests<javax.imageio.stream.IIOByteBuffer> {

    @Override
    public Class<javax.imageio.stream.IIOByteBuffer> createNewSUT() {
        return javax.imageio.stream.IIOByteBuffer.class;
    }

}
