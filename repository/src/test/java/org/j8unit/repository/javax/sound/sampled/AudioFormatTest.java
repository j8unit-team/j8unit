package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioFormatTest
implements org.j8unit.repository.javax.sound.sampled.AudioFormatTests<javax.sound.sampled.AudioFormat> {

    @RunWith(J8Unit4.class)
    public static class EncodingTest
    implements org.j8unit.repository.javax.sound.sampled.AudioFormatTests.EncodingTests<javax.sound.sampled.AudioFormat.Encoding> {

        @Override
        public javax.sound.sampled.AudioFormat.Encoding createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.sound.sampled.AudioFormat.Encoding] available.");
        }

    }

    @Override
    public javax.sound.sampled.AudioFormat createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.sound.sampled.AudioFormat] available.");
    }

}
