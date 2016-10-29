package org.j8unit.repository.java.util;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Base64Test
implements org.j8unit.repository.java.util.Base64Tests<Base64> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Base64]

    @Override
    public Base64 createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Base64], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Base64]

    @RunWith(J8Unit4.class)
    public static class EncoderTest
    implements org.j8unit.repository.java.util.Base64Tests.EncoderTests<Encoder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Base64$Encoder]

        @Override
        public Encoder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Base64.Encoder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Base64$Encoder]

    }

    @RunWith(J8Unit4.class)
    public static class DecoderTest
    implements org.j8unit.repository.java.util.Base64Tests.DecoderTests<Decoder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Base64$Decoder]

        @Override
        public Decoder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Base64.Decoder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Base64$Decoder]

    }

}
