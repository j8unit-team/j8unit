package org.j8unit.repository.java.nio;

import java.nio.Buffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Buffer} (by simply reusing the J8Unit
 * test interface {@link BufferTests}).
 */

@RunWith(J8Unit4.class)
public class BufferTest
implements BufferTests<Buffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.Buffer]

    @Override
    public Buffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.Buffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.Buffer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.Buffer]

}
