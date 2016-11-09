package org.j8unit.repository.java.nio;

import java.nio.LongBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LongBuffer} (by simply reusing the
 * J8Unit test interface {@link LongBufferTests}).
 */

@RunWith(J8Unit4.class)
public class LongBufferTest
implements LongBufferTests<LongBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.LongBuffer]

    @Override
    public LongBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.LongBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.LongBuffer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.LongBuffer]

}
