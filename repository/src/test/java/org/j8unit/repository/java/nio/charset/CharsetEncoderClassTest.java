package org.j8unit.repository.java.nio.charset;

import java.nio.charset.CharsetEncoder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharsetEncoderClassTest
implements org.j8unit.repository.java.nio.charset.CharsetEncoderClassTests<CharsetEncoder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.CharsetEncoder]

    @Override
    public Class<CharsetEncoder> createNewSUT() {
        return CharsetEncoder.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.CharsetEncoder]

}
