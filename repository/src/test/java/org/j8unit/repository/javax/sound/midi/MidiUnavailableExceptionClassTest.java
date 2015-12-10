package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiUnavailableExceptionClassTest
implements org.j8unit.repository.javax.sound.midi.MidiUnavailableExceptionClassTests<javax.sound.midi.MidiUnavailableException> {

    @Override
    public Class<javax.sound.midi.MidiUnavailableException> createNewSUT() {
        return javax.sound.midi.MidiUnavailableException.class;
    }

}
