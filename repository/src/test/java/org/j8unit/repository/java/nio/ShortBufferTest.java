package org.j8unit.repository.java.nio;

import java.nio.ShortBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ShortBuffer} (by simply reusing the
 * J8Unit test interface {@link ShortBufferTests}).
 */

@RunWith(J8Unit4.class)
public class ShortBufferTest
implements ShortBufferTests<ShortBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.ShortBuffer]

    @Override
    public ShortBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.ShortBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.ShortBuffer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.ShortBuffer]

}
