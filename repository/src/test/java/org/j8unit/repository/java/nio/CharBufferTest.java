package org.j8unit.repository.java.nio;

import java.nio.CharBuffer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CharBuffer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.CharBufferTests}).
 */
@RunWith(J8Unit4.class)
public class CharBufferTest
implements CharBufferTests<CharBuffer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.CharBuffer]

    @Override
    public CharBuffer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.CharBuffer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.CharBuffer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.CharBuffer]

}
