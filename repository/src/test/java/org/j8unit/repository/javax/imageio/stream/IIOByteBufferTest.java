package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.IIOByteBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOByteBufferTest
implements org.j8unit.repository.javax.imageio.stream.IIOByteBufferTests<IIOByteBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.stream.IIOByteBuffer]

    @Override
    public IIOByteBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.stream.IIOByteBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.stream.IIOByteBuffer]

}
