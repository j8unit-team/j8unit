package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiFileFormatClassTest
implements org.j8unit.repository.javax.sound.midi.MidiFileFormatClassTests<javax.sound.midi.MidiFileFormat> {

    @Override
    public Class<javax.sound.midi.MidiFileFormat> createNewSUT() {
        return javax.sound.midi.MidiFileFormat.class;
    }

}
