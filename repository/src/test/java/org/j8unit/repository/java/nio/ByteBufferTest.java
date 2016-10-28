package org.j8unit.repository.java.nio;

import java.nio.ByteBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteBufferTest
implements org.j8unit.repository.java.nio.ByteBufferTests<ByteBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.ByteBuffer]

    @Override
    public ByteBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.ByteBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.ByteBuffer]

}
