package org.j8unit.repository.javax.sound.sampled;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class AudioFormatTest
implements org.j8unit.repository.javax.sound.sampled.AudioFormatTests<javax.sound.sampled.AudioFormat> {

    @Override
    public javax.sound.sampled.AudioFormat createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.sound.sampled.AudioFormat] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class EncodingTest
    implements org.j8unit.repository.javax.sound.sampled.AudioFormatTests.EncodingTests<javax.sound.sampled.AudioFormat.Encoding> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.sound.sampled.AudioFormat.Encoding.ALAW, //
                                    javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED, //
                                    javax.sound.sampled.AudioFormat.Encoding.PCM_FLOAT, //
                                    javax.sound.sampled.AudioFormat.Encoding.ULAW, //
                                    javax.sound.sampled.AudioFormat.Encoding.PCM_UNSIGNED);
        }

        @Parameter(0)
        public javax.sound.sampled.AudioFormat.Encoding sut;

        @Override
        public javax.sound.sampled.AudioFormat.Encoding createNewSUT() {
            return this.sut;
        }

    }

}
