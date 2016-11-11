package org.j8unit.repository.java.nio.charset;

import java.nio.charset.CharsetEncoder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CharsetEncoder} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.charset.CharsetEncoderTests}).
 */

@RunWith(J8Unit4.class)
public class CharsetEncoderTest
implements CharsetEncoderTests<CharsetEncoder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.CharsetEncoder]

    @Override
    public CharsetEncoder createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.charset.CharsetEncoder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.CharsetEncoder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.CharsetEncoder]

}
