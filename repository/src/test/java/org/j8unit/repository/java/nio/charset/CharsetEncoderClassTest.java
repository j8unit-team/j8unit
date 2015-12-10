package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharsetEncoderClassTest
implements org.j8unit.repository.java.nio.charset.CharsetEncoderClassTests<java.nio.charset.CharsetEncoder> {

    @Override
    public Class<java.nio.charset.CharsetEncoder> createNewSUT() {
        return java.nio.charset.CharsetEncoder.class;
    }

}
