package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedAudioFileExceptionTest
implements org.j8unit.repository.javax.sound.sampled.UnsupportedAudioFileExceptionTests<javax.sound.sampled.UnsupportedAudioFileException> {

    @Override
    public javax.sound.sampled.UnsupportedAudioFileException createNewSUT() {
        return new javax.sound.sampled.UnsupportedAudioFileException();
    }

}
