package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharsetDecoderClassTest
implements org.j8unit.repository.java.nio.charset.CharsetDecoderClassTests<java.nio.charset.CharsetDecoder> {

    @Override
    public Class<java.nio.charset.CharsetDecoder> createNewSUT() {
        return java.nio.charset.CharsetDecoder.class;
    }

}
