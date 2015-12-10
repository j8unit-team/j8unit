package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiEventClassTest
implements org.j8unit.repository.javax.sound.midi.MidiEventClassTests<javax.sound.midi.MidiEvent> {

    @Override
    public Class<javax.sound.midi.MidiEvent> createNewSUT() {
        return javax.sound.midi.MidiEvent.class;
    }

}
