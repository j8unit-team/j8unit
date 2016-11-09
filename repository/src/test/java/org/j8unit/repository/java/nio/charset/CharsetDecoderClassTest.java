package org.j8unit.repository.java.nio.charset;

import java.nio.charset.CharsetDecoder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharsetDecoder} (by simply reusing the
 * J8Unit test interface {@link CharsetDecoderClassTests}).
 */

@RunWith(J8Unit4.class)
public class CharsetDecoderClassTest
implements CharsetDecoderClassTests<CharsetDecoder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.CharsetDecoder]

    @Override
    public Class<CharsetDecoder> createNewSUT() {
        return CharsetDecoder.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.charset.CharsetDecoder]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.CharsetDecoder]

}
