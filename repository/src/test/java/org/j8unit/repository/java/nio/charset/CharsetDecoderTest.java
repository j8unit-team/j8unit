package org.j8unit.repository.java.nio.charset;

import java.nio.charset.CharsetDecoder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharsetDecoderTest
implements org.j8unit.repository.java.nio.charset.CharsetDecoderTests<CharsetDecoder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.CharsetDecoder]

    @Override
    public CharsetDecoder createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.charset.CharsetDecoder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.CharsetDecoder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.CharsetDecoder]

}
