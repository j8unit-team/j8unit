package org.j8unit.repository.java.nio.charset;

import java.nio.charset.CharsetEncoder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharsetEncoder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.charset.CharsetEncoderClassTests}).
 */
@RunWith(J8Unit4.class)
public class CharsetEncoderClassTest
implements CharsetEncoderClassTests<CharsetEncoder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.CharsetEncoder]

    @Override
    public Class<CharsetEncoder> createNewSUT() {
        return CharsetEncoder.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.charset.CharsetEncoder]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.CharsetEncoder]

}
