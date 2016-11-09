package org.j8unit.repository.java.nio;

import java.nio.FloatBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FloatBuffer} (by simply reusing the
 * J8Unit test interface {@link FloatBufferTests}).
 */

@RunWith(J8Unit4.class)
public class FloatBufferTest
implements FloatBufferTests<FloatBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.FloatBuffer]

    @Override
    public FloatBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.FloatBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.FloatBuffer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.FloatBuffer]

}
