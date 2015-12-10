package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiFileWriterClassTest
implements org.j8unit.repository.javax.sound.midi.spi.MidiFileWriterClassTests<javax.sound.midi.spi.MidiFileWriter> {

    @Override
    public Class<javax.sound.midi.spi.MidiFileWriter> createNewSUT() {
        return javax.sound.midi.spi.MidiFileWriter.class;
    }

}
