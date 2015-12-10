package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioFileFormatClassTest
implements org.j8unit.repository.javax.sound.sampled.AudioFileFormatClassTests<javax.sound.sampled.AudioFileFormat> {

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.AudioFileFormatClassTests.TypeClassTests<javax.sound.sampled.AudioFileFormat.Type> {

        @Override
        public Class<javax.sound.sampled.AudioFileFormat.Type> createNewSUT() {
            return javax.sound.sampled.AudioFileFormat.Type.class;
        }

    }

    @Override
    public Class<javax.sound.sampled.AudioFileFormat> createNewSUT() {
        return javax.sound.sampled.AudioFileFormat.class;
    }

}
