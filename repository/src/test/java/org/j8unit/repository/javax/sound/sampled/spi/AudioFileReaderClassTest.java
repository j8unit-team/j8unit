package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioFileReaderClassTest
implements org.j8unit.repository.javax.sound.sampled.spi.AudioFileReaderClassTests<javax.sound.sampled.spi.AudioFileReader> {

    @Override
    public Class<javax.sound.sampled.spi.AudioFileReader> createNewSUT() {
        return javax.sound.sampled.spi.AudioFileReader.class;
    }

}
