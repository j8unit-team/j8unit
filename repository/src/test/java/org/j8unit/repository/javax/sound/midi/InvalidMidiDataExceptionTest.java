package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidMidiDataExceptionTest
implements org.j8unit.repository.javax.sound.midi.InvalidMidiDataExceptionTests<javax.sound.midi.InvalidMidiDataException> {

    @Override
    public javax.sound.midi.InvalidMidiDataException createNewSUT() {
        return new javax.sound.midi.InvalidMidiDataException();
    }

}
