package org.j8unit.repository.java.nio;

import java.nio.DoubleBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DoubleBuffer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.DoubleBufferTests}).
 */

@RunWith(J8Unit4.class)
public class DoubleBufferTest
implements DoubleBufferTests<DoubleBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.DoubleBuffer]

    @Override
    public DoubleBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.DoubleBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.DoubleBuffer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.DoubleBuffer]

}
