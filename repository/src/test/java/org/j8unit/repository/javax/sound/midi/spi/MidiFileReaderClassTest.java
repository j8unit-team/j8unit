package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiFileReaderClassTest
implements org.j8unit.repository.javax.sound.midi.spi.MidiFileReaderClassTests<javax.sound.midi.spi.MidiFileReader> {

    @Override
    public Class<javax.sound.midi.spi.MidiFileReader> createNewSUT() {
        return javax.sound.midi.spi.MidiFileReader.class;
    }

}
