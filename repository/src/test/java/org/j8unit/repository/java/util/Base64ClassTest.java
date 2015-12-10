package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Base64ClassTest
implements org.j8unit.repository.java.util.Base64ClassTests<java.util.Base64> {

    @RunWith(J8Unit4.class)
    public static class DecoderClassTest
    implements org.j8unit.repository.java.util.Base64ClassTests.DecoderClassTests<java.util.Base64.Decoder> {

        @Override
        public Class<java.util.Base64.Decoder> createNewSUT() {
            return java.util.Base64.Decoder.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class EncoderClassTest
    implements org.j8unit.repository.java.util.Base64ClassTests.EncoderClassTests<java.util.Base64.Encoder> {

        @Override
        public Class<java.util.Base64.Encoder> createNewSUT() {
            return java.util.Base64.Encoder.class;
        }

    }

    @Override
    public Class<java.util.Base64> createNewSUT() {
        return java.util.Base64.class;
    }

}
