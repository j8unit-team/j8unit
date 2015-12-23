package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioFormatClassTest
implements org.j8unit.repository.javax.sound.sampled.AudioFormatClassTests<javax.sound.sampled.AudioFormat> {

    @Override
    public Class<javax.sound.sampled.AudioFormat> createNewSUT() {
        return javax.sound.sampled.AudioFormat.class;
    }

    @RunWith(J8Unit4.class)
    public static class EncodingClassTest
    implements org.j8unit.repository.javax.sound.sampled.AudioFormatClassTests.EncodingClassTests<javax.sound.sampled.AudioFormat.Encoding> {

        @Override
        public Class<javax.sound.sampled.AudioFormat.Encoding> createNewSUT() {
            return javax.sound.sampled.AudioFormat.Encoding.class;
        }

    }

}
