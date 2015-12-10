package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioFileFormatTest
implements org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests<javax.sound.sampled.AudioFileFormat> {

    @RunWith(J8Unit4.class)
    public static class TypeTest
    implements org.j8unit.repository.javax.sound.sampled.AudioFileFormatTests.TypeTests<javax.sound.sampled.AudioFileFormat.Type> {

        @Override
        public javax.sound.sampled.AudioFileFormat.Type createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.sound.sampled.AudioFileFormat.Type] available.");
        }

    }

    @Override
    public javax.sound.sampled.AudioFileFormat createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.sound.sampled.AudioFileFormat] available.");
    }

}
