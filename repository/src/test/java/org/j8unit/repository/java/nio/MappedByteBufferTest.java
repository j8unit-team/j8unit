package org.j8unit.repository.java.nio;

import java.nio.MappedByteBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MappedByteBuffer} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.MappedByteBufferTests}).
 */
@RunWith(J8Unit4.class)
public class MappedByteBufferTest
implements MappedByteBufferTests<MappedByteBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.MappedByteBuffer]

    @Override
    public MappedByteBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.MappedByteBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.MappedByteBuffer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.MappedByteBuffer]

}
