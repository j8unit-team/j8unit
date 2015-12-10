package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiUnavailableExceptionTest
implements org.j8unit.repository.javax.sound.midi.MidiUnavailableExceptionTests<javax.sound.midi.MidiUnavailableException> {

    @Override
    public javax.sound.midi.MidiUnavailableException createNewSUT() {
        return new javax.sound.midi.MidiUnavailableException();
    }

}
