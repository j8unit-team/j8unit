package org.j8unit.repository.java.nio;

import java.nio.ByteBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ByteBuffer} (by simply reusing the
 * J8Unit test interface {@link ByteBufferTests}).
 */

@RunWith(J8Unit4.class)
public class ByteBufferTest
implements ByteBufferTests<ByteBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.ByteBuffer]

    @Override
    public ByteBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.ByteBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.ByteBuffer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.ByteBuffer]

}
