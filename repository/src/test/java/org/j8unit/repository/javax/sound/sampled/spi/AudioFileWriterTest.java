package org.j8unit.repository.javax.sound.sampled.spi;

import javax.sound.sampled.spi.AudioFileWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioFileWriterTest
implements org.j8unit.repository.javax.sound.sampled.spi.AudioFileWriterTests<AudioFileWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.spi.AudioFileWriter]

    @Override
    public AudioFileWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.spi.AudioFileWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.spi.AudioFileWriter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.spi.AudioFileWriter]

}
