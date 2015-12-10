package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidMidiDataExceptionClassTest
implements org.j8unit.repository.javax.sound.midi.InvalidMidiDataExceptionClassTests<javax.sound.midi.InvalidMidiDataException> {

    @Override
    public Class<javax.sound.midi.InvalidMidiDataException> createNewSUT() {
        return javax.sound.midi.InvalidMidiDataException.class;
    }

}
