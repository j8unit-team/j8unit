package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioFileWriterClassTest
implements org.j8unit.repository.javax.sound.sampled.spi.AudioFileWriterClassTests<javax.sound.sampled.spi.AudioFileWriter> {

    @Override
    public Class<javax.sound.sampled.spi.AudioFileWriter> createNewSUT() {
        return javax.sound.sampled.spi.AudioFileWriter.class;
    }

}
