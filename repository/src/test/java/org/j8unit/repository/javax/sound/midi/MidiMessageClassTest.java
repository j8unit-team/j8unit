package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiMessage;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiMessageClassTest
implements org.j8unit.repository.javax.sound.midi.MidiMessageClassTests<MidiMessage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiMessage]

    @Override
    public Class<MidiMessage> createNewSUT() {
        return MidiMessage.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MidiMessage]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiMessage]

}
