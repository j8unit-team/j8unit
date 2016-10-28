package org.j8unit.repository.javax.sound.sampled;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class AudioFormatTest
implements org.j8unit.repository.javax.sound.sampled.AudioFormatTests<AudioFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.AudioFormat]

    @Override
    public AudioFormat createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.sampled.AudioFormat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.AudioFormat]

    @RunWith(J8Unit4.class)
    public static class EncodingTest
    implements org.j8unit.repository.javax.sound.sampled.AudioFormatTests.EncodingTests<Encoding> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.AudioFormat$Encoding]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(Encoding.ALAW, //
                                    Encoding.PCM_SIGNED, //
                                    Encoding.PCM_FLOAT, //
                                    Encoding.ULAW, //
                                    Encoding.PCM_UNSIGNED);
        }

        @Parameter(0)
        public Encoding sut;

        @Override
        public Encoding createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.AudioFormat$Encoding]

    }

}
