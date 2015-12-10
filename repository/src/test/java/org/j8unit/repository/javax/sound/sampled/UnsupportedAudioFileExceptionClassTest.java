package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedAudioFileExceptionClassTest
implements org.j8unit.repository.javax.sound.sampled.UnsupportedAudioFileExceptionClassTests<javax.sound.sampled.UnsupportedAudioFileException> {

    @Override
    public Class<javax.sound.sampled.UnsupportedAudioFileException> createNewSUT() {
        return javax.sound.sampled.UnsupportedAudioFileException.class;
    }

}
