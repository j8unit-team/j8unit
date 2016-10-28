package org.j8unit.repository.java.nio;

import java.nio.MappedByteBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MappedByteBufferTest
implements org.j8unit.repository.java.nio.MappedByteBufferTests<MappedByteBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.MappedByteBuffer]

    @Override
    public MappedByteBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.MappedByteBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.MappedByteBuffer]

}
