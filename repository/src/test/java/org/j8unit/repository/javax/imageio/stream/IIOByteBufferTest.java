package org.j8unit.repository.javax.imageio.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOByteBufferTest
implements org.j8unit.repository.javax.imageio.stream.IIOByteBufferTests<javax.imageio.stream.IIOByteBuffer> {

    @Override
    public javax.imageio.stream.IIOByteBuffer createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.imageio.stream.IIOByteBuffer] available.");
    }

}
